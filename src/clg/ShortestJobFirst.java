package clg;

import java.util.*;

public class ShortestJobFirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];   // arrival time
        int[] bt = new int[n];   // burst time
        int[] ct = new int[n];   // completion time
        int[] wt = new int[n];   // waiting time
        int[] tat = new int[n];  // turnaround time


        boolean[] done = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print("AT of P" + (i + 1) + ": ");
            at[i] = sc.nextInt();
            System.out.print("BT of P" + (i + 1) + ": ");
            bt[i] = sc.nextInt();
        }

        int time = 0, completed = 0;

        while (completed < n) {
            int idx = -1;
            int minBT = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!done[i] && at[i] <= time && bt[i] < minBT) {
                    minBT = bt[i];
                    idx = i;
                }
            }

            if (idx == -1) {
                time++;      // idle time for cpu
                continue;
            }

            time += bt[idx];
            ct[idx] = time;
            tat[idx] = ct[idx] - at[idx];
            wt[idx] = tat[idx] - bt[idx];

            done[idx] = true;
            completed++;
        }

        System.out.println("\nP\tAT\tBT\tCT\tWT\tTAT");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t" + at[i] + "\t" + bt[i] +
                    "\t" + ct[i] + "\t" + wt[i] + "\t" + tat[i]);
        }

        sc.close();
    }
}

