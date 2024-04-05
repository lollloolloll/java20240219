package c03.exercise;

public class ExerciseP280_18 {
    public static void main(String[] args) {

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은객체");
        } else {
            System.out.println("다른객체");
        }

    }
}

class ShopService {
    // 싱글톤 인스턴스
    private static ShopService instance = new ShopService();

    // private 생성자
    private ShopService() {
    }

    // 싱글톤 인스턴스 반환 메서드
    public static ShopService getInstance() {
        return instance;
    }
}


