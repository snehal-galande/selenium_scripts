import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);


        //List<Integer> list2 = Arrays.asList(1,2,35,4,6);

        System.out.println(list.get(1));

        // index based for loop
//        for(int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }


        for (int arr: list) {
            System.out.println(arr);
        }
    }
}
