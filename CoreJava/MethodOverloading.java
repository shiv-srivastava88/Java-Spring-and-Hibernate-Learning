public class MethodOverloading {
    public static void main(String[] args) {
        ExampleOverloading e1 = new ExampleOverloading();

        System.out.println(e1.sum(2, 3));
        System.out.println(e1.sum(2, 3, 5));
        System.out.println(e1.sum(2.0f, 3.5f));
    }
}

class ExampleOverloading {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}
