public class MethodOverriding {
    public static void main(String[] args) {
        Bike b1 = new Bike("Black", 2);
        b1.run();
    }
}

class Vehicle {
    String color;
    int tyres;

    Vehicle(String color, int tyres) {
        this.tyres = tyres;
        this.color = color;
    }

    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{

    Bike(String color, int tyres) {
        super(color, tyres);
    }

    public void run() {
        System.out.println("A " + color + " bike is running");
    }
}