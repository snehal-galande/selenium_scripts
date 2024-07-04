public class SwitchStatementReturnDemo {
    public static void main(String[] args) {
        int i  = 1;

        int k = displayItem(i);
      //  System.out.println(0);
        if(k==0){
            System.out.println("Please enter correct choice");
        }
    }
    public static int displayItem(int j){
        switch (j){
            case 1:
                System.out.println("Bag");
                return 1;
            case 2:
                System.out.println("Pencil");
                return 2;
            case 3:
                System.out.println("Remote");
                return 3;
            case 4:
                System.out.println("TV");
                return 4;
            default:
                System.out.println("Invalid choice");
                return 0;
        }
    }
}
