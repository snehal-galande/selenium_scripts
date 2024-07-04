import java.util.Scanner;

public class test {

    public int sum(int a, int b) {

        return a + b;
    }

    public String name(String s) {

        return "Hello " + s;

    }

    public float multiply(float p, float q) {
        return p * q;

    }

    public double divide(double c, double d) {

        return c / d;
    }

    public boolean compare(int x, int y) {
        if (x > y)
            return true;
        else
            return false;
    }

    public char getSingleChar(String m) {
        return m.charAt(0);

    }

    public void display(String name) {
        System.out.println("My name is " + name);
    }



//    public static void main(String[] args) {
//        test t = new test();
//        int d = t.sum(6789, 987);
//        System.out.println(d);
//
//        String s = t.name("S");
//        System.out.println(s);
//
//        double e = t.divide(16, 8.333);
//        System.out.println(e);
//
//        float f = t.multiply(4, 0);
//        System.out.println(f);
//
//        boolean k = t.compare(0, 4);
//
//        if (k) {
//            System.out.println("First number is greater than second");
//        } else {
//            System.out.println("Second number is greater than first");
//        }
//        String name = "Snehal";
//        char c = t.getSingleChar(name);
//        System.out.println("first character of " + name + " is : " + c);
//
//        t.display("Aarav");
//    }
}
