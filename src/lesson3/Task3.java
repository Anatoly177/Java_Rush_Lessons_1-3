package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        message(name, age);

        String newName = reader.readLine();
        String firstNumber = reader.readLine();
        String secondNumber = reader.readLine();
        message2(newName, firstNumber, secondNumber);

        String thirdName = reader.readLine();
        message3(thirdName);

        String hisName = reader.readLine();
        String herName = reader.readLine();
        message4(hisName, herName);

        String nameMsg5 = reader.readLine();
        String name2Msg5 = reader.readLine();
        String name3Msg5 = reader.readLine();
        message5(nameMsg5, name2Msg5, name3Msg5);
        System.out.println("Жить хорошо, а хорошо жить еще лучше");
        severalMessages();

        String salary = reader.readLine();
        salaryMessage(salary);


    }

    public static void message(String name, String age) {
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }

    public static void message2(String name, String number1, String number2) {
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }

    public static void message3(String name) {
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }

    public static void message4(String name1, String name2) {
        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }

    public static void message5(String name1, String name2, String name3) {
        System.out.println(name1 + " + " + name2 + " + " + name3 + "  = Чистая любовь, да-да!");
    }

    public static void severalMessages() {
        for (int i = 0; i < 10; i++)
        System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
    }

    public static void salaryMessage(String number) {
        System.out.println("Я буду зарабатывать $" + number + " в час");
    }

}
