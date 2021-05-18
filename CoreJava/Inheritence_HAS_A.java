public class Inheritence_HAS_A {
    public static void main(String[] args) {
        
        Employees e1 = new Employees("Shivansh", "Software Developer", 178, "Juhi Lal Colony", "Kanpur", "U.P.");
        System.out.println(e1.toString());
    }
}

class Address {

    int flatNo;
    String locality, city, state;

    Address(int flatNo, String locality, String city, String state) {
        this.flatNo = flatNo;
        this.city = city;
        this.locality = locality;
        this.state = state;
    }

    @Override
    public String toString() {
        return this.flatNo +" "+ this.locality +" "+ this.city +" "+ this.state;
    }
}

// Here we tried to show that every Employee has a address hence follows HAS-A relationship
class Employees {

    String name, designation;
    Address address;

    Employees(String name, String designation, int flatNo, String locality, String city, String state) {
        this.name = name;
        this.designation = designation;
        this.address = new Address(flatNo, locality, city, state);
    }

    @Override
    public String toString() {
        
        return "\nDetails of Employee are: \n\n" + "Name = " + this.name + "\nDesignation = " + this.designation +
                "\nAddress = " + this.address.toString();
    }
}