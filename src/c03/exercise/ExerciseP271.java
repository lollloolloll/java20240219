package c03.exercise;


public class ExerciseP271 {
    public static void main(String[] args) {

        Car271 myCar = new Car271();

        myCar.setSpeed(-50);
        System.out.println("현재 속도:" + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재속도:" + myCar.getSpeed());

        if(myCar.isStop()){
            myCar.setStop(true);
            System.out.println("현재속도" + myCar.getSpeed());

        }










    }

}


 class Car271 {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed=speed;
        }

    }

     public boolean isStop() {
        return stop;
     }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) {
            this.speed=0;
        }
    }


}



