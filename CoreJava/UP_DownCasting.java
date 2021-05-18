public class UP_DownCasting {
    public static void main(String[] args) {

        // This is Upcasting
        Animals a1 = new Cats();
        a1.behaviour();
        
        // This is DownCasting
        // Cats c1 = (Cats) new Animals();  // This throws java.lang.ClassCastException 
        Animals animal = new Cats(); // This mehtods works fine
        Cats cat = (Cats) animal;
        cat.behaviour();
    }
}

class Animals {
    void behaviour() {
        System.out.println("Animal Behvaiour");
    }
}

class Cats extends Animals{
    void behaviour() {
        System.out.println("Cats Behvaiour");
    }
}