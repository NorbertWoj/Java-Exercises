public class Main {
    public static void main(String[] args) {
        Employee adam = new Employee("Adam", "11/11/1985", "01/01/2025");
        System.out.println(adam);
        System.out.println("Age = " + adam.getAge());
        System.out.println("Pay = " + adam.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee amber = new HourlyEmployee("Amber","15/10/1995","23/12/2025",15.85);
        System.out.println(amber);
        System.out.println("Amber's Paycheck = $" + amber.collectPay());
        System.out.println("Amber's Holiday Pay = $" + amber.getDoublePay());
    }
}
