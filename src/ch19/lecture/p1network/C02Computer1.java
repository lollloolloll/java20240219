package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws IOException {




        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try(socket) {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = "";

            try(is;isr;br;) {
                while ((line = br.readLine()) != null) {
                    System.out.println("메시지:" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
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