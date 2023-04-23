public class Thread1 extends Thread {
    @Override
    public void run() {
        synchronized (Main.lock1) {
            System.out.println("Thread 1: Has lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Thread 1: Waiting for lock 2");
            synchronized (Main.lock2) {
                System.out.println("Thread 1: Has lock1 and lock2");
            }
            System.out.println("Thread 1: Released lock2");
        }
        System.out.println("Thread 1: Released lock1. Exiting...");
    }
}
