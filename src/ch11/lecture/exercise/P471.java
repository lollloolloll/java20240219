package ch11.lecture.exercise;

public class P471 {
    public static void main(String[] args) {


        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.err.println("array{" + i + "]:" + value);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("배열 인덱스가 초가됨" + e.getMessage());
            } catch (Exception e) {
                System.err.println("실행에 문제가 있습니다.");
            }


        }

    }}