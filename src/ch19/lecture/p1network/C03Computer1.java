package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {


            ServerSocket serverSocket = new ServerSocket(9200);
            Socket socket = serverSocket.accept();
        try(socket) {


                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);

                FileInputStream fis = new FileInputStream("temp/dog.png");
                BufferedInputStream bis = new BufferedInputStream(fis);
            try(os; bos;fis;bis;) {
                fis.transferTo(bos);

                bos.flush();
            }
        }



    }
}
//학생1
//연결 기다리고 연결되면 socket만들기
//socket에서 outputstream 꺼내기
//BUfferedOutputStream 연결

//파일은 아무거나
//FIleInputSTream 만들기
//Buffered InputSTream연결

//BufferedInputSTream으로 읽은 데이터
//bufferedOutputStream으로 출력
//마지막에 flush()
