package ch11.lecture.exercise;


public class P483_1_8 {
    //1.4번



    //3.4번



    //4.2번



   //5.2번->3번




    public static void main(String[] args) {


        //7.
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "54321");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }

    static void login(String id, String password)throws Exception
     {
         if (!id.equals("blue")) {
             throw new NotExistIDException("아이디가 존재하지 않습니다");
         }
         if (!password.equals("12345")) {
             throw new WrongPasswordException("패스워드가 틀립니다");
         }
    }
}

class NotExistIDException extends Exception {

    NotExistIDException() {

    }

    NotExistIDException(String message) {
        super(message);
    }

}

class WrongPasswordException extends Exception {
    WrongPasswordException() {

    }

    WrongPasswordException(String message) {
        super(message);
    }
}