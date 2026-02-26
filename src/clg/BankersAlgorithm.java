package clg;

import java.util.*;

public class BankersAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of resource types: ");
        int m = sc.nextInt();

        int[][] allocation = new int[n][m];
        int[][] max = new int[n][m];
        int[][] need = new int[n][m];
        int[] available = new int[m];
        boolean[] finished = new boolean[n];

        // Input Allocation Matrix
        System.out.println("\nEnter Allocation Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                allocation[i][j] = sc.nextInt();
            }
        }

        // Input Max Matrix
        System.out.println("\nEnter Max Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max[i][j] = sc.nextInt();
            }
        }

        // Input Available Resources
        System.out.println("\nEnter Available Resources:");
        for (int i = 0; i < m; i++) {
            available[i] = sc.nextInt();
        }

        // Calculate Need Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }

        List<Integer> safeSequence = new ArrayList<>();
        int[] work = Arrays.copyOf(available, m);

        int count = 0;

        while (count < n) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (!finished[i]) {
                    int j;
                    for (j = 0; j < m; j++) {
                        if (need[i][j] > work[j])
                            break;
                    }

                    if (j == m) {  // Process can execute
                        for (int k = 0; k < m; k++) {
                            work[k] += allocation[i][k];
                        }

                        safeSequence.add(i);
                        finished[i] = true;
                        found = true;
                        count++;
                    }
                }
            }

            if (!found) {
                break;
            }
        }

        if (count == n) {
            System.out.println("\nSystem is in SAFE state.");
            System.out.print("Safe sequence: ");
            for (int i = 0; i < safeSequence.size(); i++) {
                System.out.print("P" + safeSequence.get(i));
                if (i != safeSequence.size() - 1)
                    System.out.print(" -> ");
            }
        } else {
            System.out.println("\nSystem is NOT in safe state (Deadlock may occur).");
        }

        sc.close();
    }
}