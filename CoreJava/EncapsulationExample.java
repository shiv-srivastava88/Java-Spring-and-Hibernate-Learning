public class EncapsulationExample {
    public static void main(String[] args) {
        
        Student s1 = new Student("Shivansh", 26);
        System.out.println(s1.toString());
    }
}


class Student {
    String name;
    int roll;
    
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return this.name + " " + this.roll;
    }
}