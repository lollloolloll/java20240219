//package ch14.lecture.p2concurrency;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//
//import static jdk.vm.ci.hotspot.riscv64.RISCV64HotSpotRegisterConfig.t1;
//import static jdk.vm.ci.hotspot.riscv64.RISCV64HotSpotRegisterConfig.t2;
//
//public class C07SynchronizedList {
//    public static void main(String[] args) {
//
//        Collection<String> list = Collections.synchronizedCollection(new ArrayList<>());
//
//        ArrayList<String > list = new ArrayList<>();
//        new Thread(() -> {
//            for (int i = 0; i <30000 ; i++) {
//                list.add("b");
//                list.remove("b");
//
//            }
//        });
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
