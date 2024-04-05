package C02.lecture.P02type;

public class Rectangle {
    // 멤버 변수 정의
    private int width;
    private int height;

    // 생성자 정의
    public void Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int lengthOut() {
        int length=width+height;
                return length;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.Rectangle(15, 25);
        int result=r1.lengthOut();
        System.out.println("result = " + result);
    }


}

