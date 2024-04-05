package ch12.lecture.exercise;

public class P504 {
    public static void main(String[] args) {




        SmartPhone  myPhone = new SmartPhone("samsung", "android");
        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone);






    }
}

class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + "," +os;
    }
}
