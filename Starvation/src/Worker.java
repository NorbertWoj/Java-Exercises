public class Worker implements Runnable {
    private int runCount = 1;
    private String threadColor;

    public Worker(String threadColor) {
        this.threadColor = threadColor;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            Main.lock.lock();
            try {
                System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                // execute critical section of code

            } finally {
                Main.lock.unlock();
            }
        }
    }
}