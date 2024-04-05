package ch06.lecture.p06final;

public class C01Final {
    public static void main(String[] args) {
        System.out.println("final키워드가 변수와 사용되면");
        System.out.println("변수에 값을 1번 할당할 기회를 갖는다");

        System.out.println("변수의 종류 3가지");
        System.out.println("지역변수:메서드 내에 선언");
        System.out.println("파라미터:메서드 실행시 값을 받는 변수");
        System.out.println("필드:인스턴스 필드");
        
        final int j=3;
        System.out.println("j = " + j);
        final int k;

    }
}
