package ch05.lecture.p1array;

public class C11Array {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("arr1[i] = " + arr1[i]);
            System.out.println("arr1[1]"+arr1[i]);
            
        }
        System.out.println();
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1");
            }
        System.out.println("\n");
        double[] arr2 = new double[3];
        for(int i=0;i<3;i++){
            System.out.println("arr2 = " + arr2[i]);
        }
        System.out.println();
        arr2[0]=0.1;
        arr2[1]=0.2;
        arr2[2]=0.3;
        
        for(int i=0;i<3;i++){
            System.out.println("arr2 = " + arr2[i]);
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[i] = " + arr3[i]);
        }
        System.out.println();
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[i] = " + arr3[i]);
        }

        int[] scores = {84, 90, 96};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);
        
        double avg=(double)sum/scores.length;
        System.out.println("avg = " + avg);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
