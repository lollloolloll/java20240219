//package ch14.lecture.p2concurrency;
//
//import java.util.List;
//import java.util.Vector;
//
//import static jdk.vm.ci.hotspot.riscv64.RISCV64HotSpotRegisterConfig.t1;
//import static jdk.vm.ci.hotspot.riscv64.RISCV64HotSpotRegisterConfig.t2;
//
//public class C06Vector {
//    public static void main(String[] args) {
//
//
//        List<String> vector = new Vector<>();
//        new Thread(()->{
//            for (int i = 0; 39999 >i; i++) {
//                vector.add("a");
//                vector.remove("a");
//            }
//        });
//        t1.start();
//        t2.start();
//        t2.start();
//        t2.tjoin();
//        System.out.println("vector = " + vector);
//
//    }
//}
