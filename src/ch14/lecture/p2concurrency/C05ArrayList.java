//package ch14.lecture.p2concurrency;
//
//import java.util.ArrayList;
//
//public class C05ArrayList {
//    public static void main(String[] args) throws InterruptedException {
//
//
//        ArrayList<String> list = new ArrayList<>();
//
//
//        Thread t1=new Thread(() -> {
//            for (int i = 0; i <39999 ; i++) {
//                list.add("a");
//                list.remove("a");
//
//            }
//
//        });
//        for (int i = 0; i <30000 ; i++) {
//            Thread t2 = new Thread(() -> {
//                list.add("B");
//                list.remove("B");
//
//            });
//
//
//            t1.start();
//            t2.start();
//            t1.join();
//            t2.join();
//
//
//
//
//        }
//
//
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
//}
