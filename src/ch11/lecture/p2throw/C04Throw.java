package ch11.lecture.p2throw;

import org.lwjgl.egl.EGLCapabilities;

public class C04Throw {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    static void method1() throws Exception {
        throw new ClassNotFoundException();
    }


}
