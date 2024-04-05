//package C08.lecture.exercise;
//
//public class P353_356 {
//    public static void main(String[] args) {
//        //**************P.353******************
//
//        RemoteControl353 rc;
////        rc = new Television349();
////        rc.turnOn();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
//
//interface RemoteControl353{
//    int MAX_VOLUME=10;
//    int MIN_VOLUME=0;
//
//    void turnOn();
//    void turnOff();
//    void setVolume(int volue);
//
//    default void setMute(boolean mute) {
//        if (mute) {
//            System.out.println("무음 처리합니다");
//            setVolume(MIN_VOLUME);
//        } else {
//            System.out.println("무음 해제합니다");
//        }
//        }
//
//}
//
//interface RemoteControl348 {
//
//
//    int MAX_VOLUME=10;
//    int MIN_VOLUME=0;
//
//    void turnOn();
//    void turnOff();
//
//    void setVolume(int volume);
//
//
//}
//
//class Television349 implements RemoteControl348 {
//    private int volume;
//
//    @Override
//    public void turnOn() {
//        System.out.println("Tv를 켭니다");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Tv를 끕니다");
//
//    }
//
//    @Override
//    public void setVolume(int volume) {
//        if (volume > RemoteControl348.MAX_VOLUME) {
//            this.volume = RemoteControl348.MAX_VOLUME;
//        } else if (volume < RemoteControl348.MIN_VOLUME) {
//            this.volume = RemoteControl348.MIN_VOLUME;
//
//        } else {
//            this.volume=volume;
//        }
//        System.out.println("현재 TV 볼륨:"+this.volume);
//    }
//}
//
//class Audio implements RemoteControl348 {
//    private int volume;
//
//    @Override
//    public void turnOn() {
//        System.out.println("Audio를 켭니다");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Audio를 끕니다");
//
//    }
//
//    @Override
//    public void setVolume(int volume) {
//        if (volume > RemoteControl348) {
//            this.volume = RemoteControl348.MAX_VOLUME;
//        } else if (volume < RemoteControl348.MIN_VOLUME) {
//            this.volume = RemoteControl348.MIN_VOLUME;
//        } else {
//            this.volume = volume;
//        }
//        System.out.println("현재 Audio볼륨"+volume);
//    }
//}