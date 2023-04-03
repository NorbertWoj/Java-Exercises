public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial using recursion for number " + number + " is: " + factorialUsingRecursion(number));
        System.out.println("Factorial using for loop statement for number " + number + " is: " + factorialUsingForLoop(number));

    }

    public static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}