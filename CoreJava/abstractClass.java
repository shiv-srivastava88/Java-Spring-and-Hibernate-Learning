public class abstractClass {
    public static void main(String[] args) {
        Shape s1 = new Sqaure(); // Upcasting, Dynamic binding
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Sqaure extends Shape {
    void draw(){
        System.out.println("Draw a sqaure");
    }
}

class Rectangle extends Shape {
    void draw(){
        System.out.println("Draw a Rectangle");
    }
}