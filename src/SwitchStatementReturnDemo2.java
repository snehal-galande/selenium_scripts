import java.util.Scanner;

public class SwitchStatementReturnDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator");
        String operator=sc.next();
        int a =4;
        int b =2;
        //String operator = "+";
        int k= calculator(a,b,operator);
        System.out.println(k);
    }

    public static int calculator(int a,int b,String operator){
        switch(operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                return 0;
        }
    }
    
}
