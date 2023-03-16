public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count " + printer.getPagesPrnted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrnted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrnted());
    }
}