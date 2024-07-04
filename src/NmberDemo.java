import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NmberDemo {
    public static void main(String[] args) {
//        first approch
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        //2nd approch

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<String> ele = Arrays.asList("Snehal", "Rahul", "Aarav");

        for (Integer i : list) {
            System.out.println(i);
        }


        for (String s: ele) {
            System.out.println(s);
        }
    }
}
