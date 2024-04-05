package ch09.lecture.exercise;

public class P411 {


    public static void main(String[] args) {

        Button btnOk = new Button();
        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("Ok버튼을 클릭했습니다");
            }
        }
        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("Cancel버튼을 클릭했습니다");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();












    }
}

class Button {
    static interface ClickListener {
        void onClick();
    }
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener=clickListener;
    }

    void click() {
        this.clickListener.onClick();
    }












}









