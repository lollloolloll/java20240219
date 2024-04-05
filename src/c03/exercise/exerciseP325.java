package c03.exercise;

public class exerciseP325 {
    public static void main(String[] args) {
        SmartPhone325 smartPhone = new SmartPhone325("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();


    }


}

class Phone325 {
    String owner;

    Phone325(String owner) {
        this.owner=owner;
    }

    void turnOn() {
        System.out.println("전원을 켭니다");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다");
    }
}

class SmartPhone325 extends Phone325 {
    public SmartPhone325(String owner) {
        super(owner);
    }
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다");
    }


}

