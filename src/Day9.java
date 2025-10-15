public class Day9 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();

        duck.fly();
        fish.swim();
    }
}

interface Swimmable {
    void swim();
}
interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}

class Fish implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}