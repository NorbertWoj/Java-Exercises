public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("Norbert");
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();
        myAccount.balance = 5000;

        System.out.println("Balance on account is " + myAccount.getBalance());
        myAccount.transactions.add(4500);
        myAccount.calculateBalance();


    }
}