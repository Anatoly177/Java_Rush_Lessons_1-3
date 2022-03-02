package lesson3;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("MAY 1 2012");
        System.out.println(850);

        class pers {
            String name;

            public void setName(String name) {
                this.name = name;
            }
        }

        class Zerg extends pers {}
        class Protos extends pers {}
        class Terran extends pers {}

        Zerg john = new Zerg();
        Zerg nick = new Zerg();
        Zerg oliver = new Zerg();
        Zerg jack = new Zerg();
        Zerg harry = new Zerg();
        Zerg jacob = new Zerg();
        Zerg charlie = new Zerg();
        Zerg thomas = new Zerg();
        Zerg oscar = new Zerg();
        Zerg william = new Zerg();

        john.setName("John");
        nick.setName("Nick");
        oliver.setName("Oliver");
        jack.setName("Jack");
        harry.setName("Harry");
        jacob.setName("Jacob");
        charlie.setName("Charlie");
        thomas.setName("Thomas");
        oscar.setName("Oscar");
        william.setName("William");

        Protos james = new Protos();
        Protos george = new Protos();
        Protos amelia = new Protos();
        Protos olivia = new Protos();
        Protos emily = new Protos();

        james.setName("James");
        george.setName("George");
        amelia.setName("Amelia");
        olivia.setName("Olivia");
        emily.setName("Emily");

        Terran noah = new Terran();
        Terran liam = new Terran();
        Terran sophia = new Terran();
        Terran mason = new Terran();
        Terran mia = new Terran();
        Terran benjamin = new Terran();
        Terran charlotte = new Terran();
        Terran michael = new Terran();
        Terran elijah = new Terran();
        Terran ethan = new Terran();
        Terran emma = new Terran();
        Terran ava = new Terran();

        noah.setName("Noah");
        liam.setName("Liam");
        sophia.setName("Sophia");
        mason.setName("Mason");
        mia.setName("Mia");
        benjamin.setName("Benjamin");
        charlotte.setName("Charlotte");
        michael.setName("Michael");
        elijah.setName("Elijah");
        ethan.setName("Ethan");
        emma.setName("Emma");
        ava.setName("Ava");

        System.out.println(multi10());
        summ10();

    }

    public static long multi10() {
        long x = 1;
        for (int i = 1; i <= 10; i++ ) {
            x = x * i;
        }
        return x;
    }

    public static void summ10()
    {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x = x + i;
            System.out.println(x);
        }
    }


}
