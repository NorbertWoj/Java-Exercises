public class Thread2 extends Thread {
    @Override
    public void run() {
        synchronized (Main.lock1) {
            System.out.println("Thread 2: Has lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Thread 2: Waiting for lock2");
            synchronized (Main.lock2) {
                System.out.println("Thread 2: Has lock2 and lock2");
            }
            System.out.println("Thread 2: Released lock2");
        }
        System.out.println("Thread 2: Released lock1. Exiting...");
    }
}
