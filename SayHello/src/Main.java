public class Main {
    public static void main(String[] args) {
        PolitePerson jane = new PolitePerson("Jane");
        PolitePerson john = new PolitePerson("John");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);
            }
        }).start();

        // 1. Thread1 acquires the lock on the jane object and enters the sayHello() method.
        // It prints to the console, then suspends.
        // 2. Thread2 acquires the lock on the john object and enters the sayHello() method.
        // It prints to the console, then suspends.
        // 3. Thread1 runs again and wants to say hello back to the john object. It tries to call the sayHelloBack() method
        // using the john object that was passed into the sayHello() method,
        // but Thread2 is holding the john lock, so Thread1 suspends.
        // 4. Thread2 runs again and wants to say hello back to the jane object. It tries to call the sayHelloBack() method
        // using the jane object that was passed into the sayHello() method,
        // but Thread1 is holding the jane lock, so Thread2 suspends.

        jane.sayHello(john);
        john.sayHello(jane);
    }
}