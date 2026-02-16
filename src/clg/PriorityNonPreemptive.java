package clg;

import java.util.*;

class Process {
    int id, arrival, burst, priority;
    int completion, waiting, turnaround;

    Process(int id, int arrival, int burst, int priority) {
        this.id = id;
        this.arrival = arrival;
        this.burst = burst;
        this.priority = priority;
    }
}

public class PriorityNonPreemptive {

    public static void main(String[] args) {

        Process[] p = {
                new Process(1,0,3,1),
                new Process(2,1,2,0),
                new Process(3,2,5,2),
                new Process(4,3,7,4),
                new Process(5,4,4,3)
        };

        int time = 0;
        int completed = 0;
        boolean[] done = new boolean[p.length];

        while (completed < p.length) {

            int idx = -1;
            int highest = Integer.MAX_VALUE;

            for (int i = 0; i < p.length; i++) {
                if (!done[i] && p[i].arrival <= time) {
                    if (p[i].priority < highest) {
                        highest = p[i].priority;
                        idx = i;
                    }
                }
            }

            if (idx != -1) {
                time += p[idx].burst;
                p[idx].completion = time;
                p[idx].turnaround = p[idx].completion - p[idx].arrival;
                p[idx].waiting = p[idx].turnaround - p[idx].burst;

                done[idx] = true;
                completed++;
            } else {
                time++;
            }
        }

        double avgWT = 0, avgTAT = 0;

        System.out.println("Process\tWT\tTAT");

        for (Process pr : p) {
            avgWT += pr.waiting;
            avgTAT += pr.turnaround;
            System.out.println("P" + pr.id + "\t" + pr.waiting + "\t" + pr.turnaround);
        }

        System.out.println("Average WT: " + avgWT / p.length);
        System.out.println("Average TAT: " + avgTAT / p.length);
    }
}
