package clg;

import java.util.Scanner;

public class FirstComeFirstServe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] processes = new String[3];
        int[] arrivaltime = new int[3];
        int[] bursttime = new int[3];

        int currentTime = 0;
        int[] waitingTime = new int[3];
        float avgWaiting = 0 ;
        float avgTurnaround = 0 ;
        int[] turnaroundtime = new int[3];
        int[] starttime = new int[3];
        int[] completiontime=new int[3];
        int totalTurnAroundTime=0;
        int totalWaitingTime =0;



        // taking arrays as input
        for (int i = 0 ; i<arrivaltime.length;i++){
            System.out.print("Enter "+ (i+1) + " process name:" );
            processes[i]= sc.next();
            System.out.print("Enter Arrival Time:" );
            arrivaltime[i]= sc.nextInt();
            System.out.print("Enter Burst Time:");
            bursttime[i] = sc.nextInt();

            // logic
            if (currentTime < arrivaltime[i]) {
                currentTime = arrivaltime[i];
            }

            starttime[i] = currentTime;
            waitingTime[i] = starttime[i] - arrivaltime[i];

            completiontime[i] = starttime[i] + bursttime[i];
            turnaroundtime[i] = completiontime[i] - arrivaltime[i];

            currentTime = completiontime[i];

            totalWaitingTime += waitingTime[i];
            totalTurnAroundTime += turnaroundtime[i];



        }


        avgTurnaround = (float) totalTurnAroundTime / 3;
        avgWaiting = (float) totalWaitingTime / 3;

        //printing the table
        System.out.println();
        System.out.println("Process | Arrival | Burst | Waiting | Turnaround");

        for (int i = 0; i < processes.length; i++) {
            System.out.println(processes[i] + "   \t\t"
                    + arrivaltime[i] + "  \t\t"
                    + bursttime[i] + "   \t\t"
                    + waitingTime[i] + "   \t\t"
                    + turnaroundtime[i]);
        }

        System.out.println("\nAverage Waiting Time = " + avgWaiting);
        System.out.println("Average Turnaround Time = " + avgTurnaround);





    }
}
