package ch11.lecture.p3costom;

public class C04Custom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (LackOfcaffeineException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    static void method1() throws LackOfcaffeineException {
        throw new LackOfcaffeineException("카페인 부족!");
    }

    static class LackOfcaffeineException extends Exception {
        LackOfcaffeineException() {
        }

        LackOfcaffeineException(String message) {
            super(message);
        }
    }
}
