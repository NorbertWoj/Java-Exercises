public class Main {
    public static void main(String[] args) {
        Employee Adam = new Employee("Adam", "11/11/1985", "01/01/2025");
        System.out.println(Adam);
        System.out.println("Age = " + Adam.getAge());
        System.out.println("Pay = " + Adam.collectPay());

        Employee Joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(Joe);

    }
}
