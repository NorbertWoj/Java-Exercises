public class Main {
    public static void main(String[] args) {
        System.out.println("The 2th fibonacci number is: " + fib(3));
        System.out.println("The 6th fibonacci number is: " + fib(6));
        System.out.println("The 12th fibonacci number is: " + fib(12));

    }

    public static long fib (int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}