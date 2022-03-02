package lesson3;

public class Task2 {

    public static void main(String[] args) {
        String mama = "Мама";
        String mila = "Мыла";
        String ramu = "Раму";



        System.out.println(mama + mila + ramu);
        System.out.println(mama + ramu + mila);
        System.out.println(mila + mama + ramu);
        System.out.println(mila + ramu + mama);
        System.out.println(ramu + mila + mama);
        System.out.println(ramu + mama + mila);

        multi10x10();

        class Colors {
            String color;

            public void setColor(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }
        }

        Colors red = new Colors();
        Colors orange = new Colors();
        Colors yellow = new Colors();
        Colors green = new Colors();
        Colors blue = new Colors();
        Colors indigo = new Colors();
        Colors violet = new Colors();

        red.setColor("Red");
        orange.setColor("Orange");
        yellow.setColor("Yellow");
        green.setColor("Green");
        blue.setColor("Blue");
        indigo.setColor("Indigo");
        violet.setColor("Violet");

        System.out.println(red.getColor());
        System.out.println(orange.getColor());
        System.out.println(yellow.getColor());
        System.out.println(green.getColor());
        System.out.println(blue.getColor());
        System.out.println(indigo.getColor());
        System.out.println(violet.getColor());

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
        System.out.println("日本語");

    }

    public static void multi10x10() {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                x = i * j;
                System.out.print(x + " ");
            }
            System.out.print("\n");
        }
    }

}
