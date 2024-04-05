public class C04LocalClass {
    void method1() {
        final int j=3;
        class LocalClass {
            void method1() {
                int i=0;
                System.out.println("i = " + i);
                i=1;
                System.out.println("i = " + i);
                //감싸고 있는 메서드의 final지역변수만 사용 가능
                System.out.println("j = " + j);
            }
        }

        LocalClass local = new LocalClass();
        local.method1();
    }

    public static void main(String[] args) {
        C04LocalClass outer = new C04LocalClass();
        outer.method1(); // 외부 클래스의 인스턴스를 생성한 후에 메서드 호출
    }
}
