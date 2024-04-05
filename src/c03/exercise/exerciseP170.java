package c03.exercise;

public class exerciseP170 {
    public static void main(String[] args) {

        int[] scores;

        scores = new int[]{83, 90, 87};
        int sum1=0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 = " + sum1);

        printItem(new int[]{83, 90, 87});

        String[] season = {"Spring", "Summer", "Fall", "winter"};
        for(int i=0;i<season.length;i++)
        {System.out.println("season["+i+"] = " + season[i]);}
        season[1] = "여름";
        System.out.println("season[1] = " + season[1]);






    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("scores = " + scores[i]);
        }
    }





}
