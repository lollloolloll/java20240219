import java.util.*;

public class P648 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<int[]> list3 = new LinkedList<>();
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(i, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간:", (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린시간:", (endTime - startTime));

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        list3.add(new int[]{1,3,3});
        list3.add(new int[]{3});
        list3.add(new int[]{5});
        list3.add(new int[]{7});
        list3.add(new int[]{9});
        System.out.println(list3.toArray());
        System.out.println(list3.toString());


    }

}
