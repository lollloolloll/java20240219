package ch11.lecture.exercise;

public class P470 {
    public static void main(String[] args) {

        String[] array = {"100", "1oo"};
        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]:" + value);
            }
        } catch (NumberFormatException e) {
            System.err.println("숫자로 변환할 수 없음:"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("배열 인덱스가 초가됨:" + e.getMessage());
        }



    }
}
