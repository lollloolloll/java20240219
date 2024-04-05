package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket("172.30.1.73", 9000);
             InputStream is = socket.getInputStream();
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream("temp/bigfile/receivedfile12.png")) {

            bis.transferTo(os);
            os.flush();

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

//학생2
//서버에 연결해서 socket만들기

//socket에서 inputstream 꺼내기
//BufferedinputSTream 연결

//파일명 아무거나
//FileOutputstream 만들기
//BufferedOutputStream연결

//Bufferedinputstream에서 읽은 데이터
//bufferedOutputStream으로 쓰기

//끝.
