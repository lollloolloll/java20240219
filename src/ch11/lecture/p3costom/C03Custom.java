package ch11.lecture.p3costom;

public class C03Custom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (BreakDoorHandleException e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
        }
    }

    static class BreakDoorHandleException extends RuntimeException {
        BreakDoorHandleException(String message) {
            super(message);
        }
    }

    static void method1() {
        throw new BreakDoorHandleException("문괴가 고장남");
    }
}
