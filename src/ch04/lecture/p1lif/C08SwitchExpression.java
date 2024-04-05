package ch04.lecture.p1lif;

public class C08SwitchExpression {
    public static void main(String[] args) {

        String city = "런던";
        String region = switch (city) {
            case "서울", "도쿄" -> "아시아";
            case "런던", "파리" -> "유럽";
            default -> "기타지역";
        };

        System.out.println(city + "는 " + region + "입니다.");
    }
}
