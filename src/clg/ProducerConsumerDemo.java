package clg;

public class ProducerConsumerDemo {

    // Shared Resource (Buffer)
    static class Buffer {
        private int data;
        private boolean isEmpty = true;

        // Producer puts data
        synchronized void produce(int value) {
            while (!isEmpty) {  // buffer full → wait
                try { wait(); } catch (Exception e) { }
            }

            data = value;
            System.out.println("Produced: " + value);
            isEmpty = false;

            notify(); // wake consumer
        }

        // Consumer removes data
        synchronized int consume() {
            while (isEmpty) {  // buffer empty → wait
                try { wait(); } catch (Exception e) { }
            }

            System.out.println("Consumed: " + data);
            isEmpty = true;

            notify(); // wake producer
            return data;
        }
    }

    // Producer Thread
    static class Producer extends Thread {
        Buffer buffer;

        Producer(Buffer b) {
            this.buffer = b;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                try { Thread.sleep(500); } catch (Exception e) { }
            }
        }
    }

    // Consumer Thread
    static class Consumer extends Thread {
        Buffer buffer;

        Consumer(Buffer b) {
            this.buffer = b;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                try { Thread.sleep(500); } catch (Exception e) { }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
