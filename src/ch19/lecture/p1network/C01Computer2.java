//package ch19.lecture.p1network;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.Socket;
//
//public class C01Computer2 {
//
//    public static void main(String[] args) throws IOException {
//
//Socket socket=new Socket();
//
//        try {
//            InputStream is = socket.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);
//            try {
//                String data= br.readLine();
//                System.out.println("컴퓨터 1이 보낸 메시지="+data);
//            }
//        }
//
//
//    }
//}
