package c03.exercise;

public class ExerciseP279 {
    public static void main(String[] args) {
        MemberService memberService=new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");
        }else{
            System.out.println("Id또는Password가 올바르지 않습니다");

        }

    }
}
class MemberService{
    boolean login(String id,String password) {
        if ((id == "hong") && (password == "12345")) {
            return true;
        }return false;

    }

    void logout(String id) {
        System.out.println(id+"님이 로그아웃 되었습니다");
    }

}
