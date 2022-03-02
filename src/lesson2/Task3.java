package lesson2;

public class Task3 {

    public static void main(String[] args)
    {
        int a = 2, b = 8, c = 1, d = 5;
        int m = min(a, b);
        int n = max(a, b);
        int p = maxOfThree(a, b, c);
        int r = minOfFour(a, b, c, d);
        System.out.println("Minimum of two is " + m);
        System.out.println("Maximum of two is " + n);
        System.out.println("Maximum of three is " + p);
        System.out.println("Minimum of four is " + r);
        print3("Hello world!");
        print3OneString("Hello, my friend!");
    }

    public static int min(int c, int d)
    {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }

    public static int max(int c, int d)
    {
        int m2;
        if (c > d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }

    public static int maxOfThree(int c, int d, int e)
    {
        int m3;
        if (max(c, d) > e)
            m3 = max(c, d);
        else
            m3 = e;

        return m3;
    }

    public static int minOfFour(int c, int d, int e, int f)
    {
        int m4;
        if (min(c, d) < min(e, f))
            m4 = min(c, d);
        else
            m4 = min(e, f);

        return m4;
    }

    public static void print3(String text)
    {
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

    public static void print3OneString(String text)
    {
        System.out.print(text + " ");
        System.out.print(text + " ");
        System.out.print(text);
    }

}
