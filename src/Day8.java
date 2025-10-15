public class Day8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

}

abstract class Animal {

    public void makeSound() {

    }

    public void eat() {
        System.out.println("The animal is eating");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");;
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");;
    }
}
