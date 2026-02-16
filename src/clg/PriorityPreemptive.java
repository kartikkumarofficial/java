package clg;

import java.util.*;

class ProcessP {
    int id, arrival, burst, priority;
    int remaining, completion, waiting, turnaround;

    ProcessP(int id, int arrival, int burst, int priority) {
        this.id = id;
        this.arrival = arrival;
        this.burst = burst;
        this.priority = priority;
        this.remaining = burst;
    }
}

public class PriorityPreemptive {

    public static void main(String[] args) {

        ProcessP[] p = {
                new ProcessP(1,0,3,1),
                new ProcessP(2,1,2,0),
                new ProcessP(3,2,5,2),
                new ProcessP(4,3,7,4),
                new ProcessP(5,4,4,3)
        };

        int time = 0, completed = 0;

        while (completed < p.length) {

            int idx = -1;
            int highest = Integer.MAX_VALUE;

            for (int i = 0; i < p.length; i++) {
                if (p[i].arrival <= time && p[i].remaining > 0) {
                    if (p[i].priority < highest) {
                        highest = p[i].priority;
                        idx = i;
                    }
                }
            }

            if (idx != -1) {
                p[idx].remaining--;
                time++;

                if (p[idx].remaining == 0) {
                    p[idx].completion = time;
                    p[idx].turnaround = p[idx].completion - p[idx].arrival;
                    p[idx].waiting = p[idx].turnaround - p[idx].burst;
                    completed++;
                }
            } else {
                time++;
            }
        }

        double avgWT = 0, avgTAT = 0;

        System.out.println("Process\tWT\tTAT");

        for (ProcessP pr : p) {
            avgWT += pr.waiting;
            avgTAT += pr.turnaround;
            System.out.println("P" + pr.id + "\t" + pr.waiting + "\t" + pr.turnaround);
        }

        System.out.println("Average WT: " + avgWT / p.length);
        System.out.println("Average TAT: " + avgTAT / p.length);
    }
}
