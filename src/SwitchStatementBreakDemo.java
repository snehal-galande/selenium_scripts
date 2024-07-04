import java.util.Scanner;

public class SwitchStatementBreakDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day name");
        String str = sc.next();


        display(str);

    }

    public static void display(String s){
        switch (s) {

            case "monday":
                System.out.println("Today is monday");
                break;

            case "tuesday":
                System.out.println("Today is tuesday");
                break;

            case "wednesday":
                System.out.println("Today is wednesday");
                break;

            default:
                System.out.println("Entered day does not match");
        }

    }
}
