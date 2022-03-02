package lesson2;

public class Task1 {

    class Cat {
    }

    Cat john = new Cat();
    Cat alex = new Cat();

    public static class Dog {
        String name;

        public void setName(String name) {
            this.name = name;
        }

    }


    public static void main(String[] args) {
        Dog max = new Dog();
        Dog bella = new Dog();
        Dog jack = new Dog();
        max.setName("Max");
        bella.setName("Bella");
        jack.setName("Jack");
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
    }
}
