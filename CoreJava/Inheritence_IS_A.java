public class Inheritence_IS_A {
    public static void main(String[] args) {
        Coder c1 = new Coder("Shivansh");

        System.out.println("Salary of " + c1.name + " is " + (c1.salary + c1.coderBonus));
    }
}


class Employee {
    float salary = 50000;
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

// Here we tried to show that Coder is also an Employee and follows IS-A relationship
class Coder extends Employee{
    int coderBonus = 20000;

    Coder(String name) {
        super(name);
        System.out.println(salary + coderBonus);
    }
}