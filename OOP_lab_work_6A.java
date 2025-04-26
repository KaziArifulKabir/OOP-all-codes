class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
    void makeSound() {
        System.out.println("Dog makes a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.makeSound();
        a.makeSound();         
    }
}
