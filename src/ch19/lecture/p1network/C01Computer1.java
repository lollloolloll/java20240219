//package ch19.lecture.p1network;
//
//import org.lwjgl.system.linux.Socket;
//
//import java.io.BufferedWriter;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//
//public class C01Computer1 {
//    public static void main(String[] args) {
//
//        ServerSocket serverSocket=new ServerSocket(9000);
//
//        Socket socket=serverSocket.accept();
//
//
//        try(socket) {
//            OutputStream os=socket.getOutputStream();
//            OutputStreamWriter osw = new OutputStreamWriter(os);
//            BufferedWriter bw = new BufferedWriter(osw);
//            PrintWriter pw = new PrintWriter(bw);
//
//
//            try(os;bw;) {
//                System.out.println("hello world");
//            }
//        }
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
//}
