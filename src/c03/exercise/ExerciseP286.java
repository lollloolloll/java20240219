package c03.exercise;

public class ExerciseP286 {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델:"+myPhone.model);
        System.out.println("색깔:"+myPhone.color);

        System.out.println("와이파이의 상태" + myPhone.wifi);
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕핫요!@ 전 홍길동입니다");
        myPhone.sendVoice("아~네,반값브니다");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();

    }
}

class Phone {
    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다");
    }

    public void sendVoice(String message) {
        System.out.println("자기"+message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방:"+message);

    }

    public void hangUp() {
        System.out.println("전화를 끊습니다");
    }


}

class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model=model;
        this.color=color;
    }

    public void setWifi(Boolean wifi) {
        this.wifi=wifi;
        System.out.println("와이파이 상태를 변경했습니다");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다");
    }



}
