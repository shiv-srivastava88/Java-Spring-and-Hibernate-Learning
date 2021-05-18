public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 50, b = 0;
            int i = a / b; // may throw arithmetic exception
            System.out.println("Result is " + i);
        } catch (ArithmeticException e) { // Handling arithmetic excetpion
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) { // Handling ArrayIndexOutOfBound excetpion
            System.out.println("ArrayIndexOutOfBound exception occurred");
        } finally {
            // Finally block in java can be used to put "cleanup" code such as closing a
            // file, closing connection etc.
            System.out.println("Finally block is always executed.");
        }
        System.out.println("Rest code");

        validate(13);  // For understanding throw keyword
        p();  // For understanding propogation of exception
    }

    // Using throw keyword; throw keyword is basically used to throw custom
    // exception...
    static void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("Age not valid for voting");
        } else {
            System.out.println("You can vote");
        }
    }

    // Propogating uncaught exceptions
    // By defualt Unchecked Exceptions are forwarded in calling chain (propagated).
    static void m() {
        int data = 10 / 0;
        System.out.println(data);
    }

    static void n() {
        m();
    }

    static void p(){
        try {
            n();
        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
}
