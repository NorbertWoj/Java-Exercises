public class Countdown {
    private int i;
    public synchronized void doCountdown() {
        String color;
         switch (Thread.currentThread().getName()) {
             case "Thread 1" :
                 color = ThreadColor.ANSI_CYAN;
                 break;
             case "Thread 2" :
                 color = ThreadColor.ANSI_PURPLE;
                 break;
             default:
                 color = ThreadColor.ANSI_GREEN;
         }

         synchronized (color) {
             for (i = 10; i > 0; i--) {
                 System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
             }
         }

    }
}
