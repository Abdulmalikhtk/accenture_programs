class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class insof {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        System.out.println(animal1 instanceof Animal); // true
        System.out.println(animal1 instanceof Dog);    // true
        System.out.println(animal1 instanceof Cat);    // false

        System.out.println(animal2 instanceof Animal); // true
        System.out.println(animal2 instanceof Dog);    // false
        System.out.println(animal2 instanceof Cat);    // true
    }
}
