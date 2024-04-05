package ch09.lecture.exercise;

public class P425_5_7 {
    public static void main(String[] args) {

        //************5번***************
        Action action=new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다");
            }
        };
        action.work();
//**************6번*******************
        Anonymous7 anony=new Anonymous7();
        anony.field.run();
        anony.method1();
        anony.method2(new Vehicle7() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다");
            }
        });




        //*******************7번*****************



    }
}

interface Action {
    void work();
}

interface Vehicle7 {
    void run();
}

class Anonymous7 {
     Vehicle7 field=new Vehicle7() {
        @Override
        public void run() {
            System.out.println("자전거가 달랍니다");
        }
    };
    void method1() {
        Vehicle7 localVar=new Vehicle7() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다");
            }
        };
        localVar.run();
    }
    void method2(Vehicle7 v) {
        v.run();
    }
}

class Chatting {
    class Chat {
        void start() {

        }

        void sendMessage(String message) {

        }
    }

    void startChat(String chatId) {
        final String nickName = chatId;
        Chat chat=new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "hiihihihihihi";
                    String message = nickName + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();

    }


}
