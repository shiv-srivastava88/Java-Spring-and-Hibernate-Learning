public class superExample {
    public static void main(String[] args) {
        B b1 = new B(1, "Shivansh", 2);
        System.out.println(b1.voidString());
    }
}


class A {
    int a;
    String b;

    A(int a, String b) {
        this.a = a;
        this.b = b;

        System.out.println("Inside parent class (A) constructor");
    }

    void check() {
        System.out.println("This is check method of A");
    }
}

class B extends A {
    int c;

    B(int a, String b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Inside child class (B) constructor");
    }

    public String voidString() {
        return "Parameters are --> a = "+ a + ", b = " + b + ", c = " + c;
    }
}