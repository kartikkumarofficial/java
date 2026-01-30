package clg;

public class producerconsumer2 {

    //    shared resource
    static class Buffer {
        private int data;
        private boolean isEmpty = true;

        //        producer puts data
        synchronized void produce(int value) {
            while (!isEmpty) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            data = value;
            System.out.println("Produced: " + value);
            isEmpty = false;

        }
//        consumer removes data

            synchronized int consume () {
                while (isEmpty) {
                    try {
                        wait();
                    } catch (Exception e) {
                    e.printStackTrace();
                    }}

                    System.out.println("Consumed:"+data);
                    isEmpty=true;
                    notify();
                    return data;


                }

        }


    }

