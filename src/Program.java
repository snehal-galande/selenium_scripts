import java.util.Scanner;
import java.util.SortedMap;

public class Program {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.sum(4, 5));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("first number is " + firstNumber);
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Second number is " + secondNumber);
        if(firstNumber==secondNumber)
            System.out.println("Both numbers are equal");
        else{
            boolean k = t.compare(firstNumber, secondNumber);
            if (k)
                System.out.println(firstNumber + " number is greater than " + secondNumber);
            else
                System.out.println(secondNumber + " number is greater than " + firstNumber);
        }


        if(secondNumber>0){
            double r = t.divide(firstNumber,secondNumber);
            System.out.println(r);
        }else{
            System.out.println("Second number should be greater than 0");
        }

    }
}
