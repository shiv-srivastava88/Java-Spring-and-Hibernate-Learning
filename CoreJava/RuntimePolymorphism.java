public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Animal(); // This is static binding
        Animal a1 = new Dog(); // This is dynamic binding
        Animal a2 = new Cat();

        a.eat();
        a1.eat();
        a2.eat();
    }
}

// In runtime a call to an overridden method is resolved at runtime rather than compile-time.
// If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {

    void eat() {
        System.out.println("Cat is eating");
    }
}