class Animal {}
class Dog extends Animal {}

public class instance {
    public static void main(String[] args) {
        Animal animal = new Dog();
        
        if (animal instanceof Dog) {
            System.out.println("This animal is a dog.");
        } else {
            System.out.println("This animal is not a dog.");
        }
    }
}

