package lesson2;

public class Task2 {

    class Cat {}

    Cat one;
    Cat two;
    Cat three;
    Cat four;
    Cat five;
    Cat six;
    Cat seven;
    Cat eight;
    Cat nine;
    Cat ten;

    Cat first = new Cat();
    Cat second = new Cat();
    Cat third = new Cat();
    Cat fourth = new Cat();
    Cat fifth = new Cat();
    Cat sixth = new Cat();
    Cat seventh = new Cat();
    Cat eighth = new Cat();

    public static void main(String[] args) {
        class animals {
            String owner;

            public void setOwner(String owner) {
                this.owner = owner;
            }
        }

        class Cat extends animals {}

        class Dog extends animals {}

        class Fish extends animals {}

        class Woman {}

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();

        cat.setOwner("John");
        dog.setOwner("Luis");
        fish.setOwner("Alex");
    }
}
