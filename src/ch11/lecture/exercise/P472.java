package ch11.lecture.exercise;

public class P472 {
    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]:" + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("배열 인덱스가 초가됨" + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.err.println("데이터가 문제가있음:"+e.getMessage());
            }
        }



    }
}
