public class StaticInitializationBlockTest {
    public static final String owner;

    static {
        owner = "norbert";
        System.out.println("SIBTest static initialization block called");
    }

    public StaticInitializationBlockTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
