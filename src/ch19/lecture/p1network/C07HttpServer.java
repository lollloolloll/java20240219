package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try(socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try(os;osw;bw;pw) {
                //content
                String body = """
                <html>
                        <head>
                            <title>직접 만드는 HTML코드</title>
                        </head
                        <body>
                            <h1>처음부터 만들어 본SERVER</h1>
                            <p>너무 힘들어서 이렇게 못하겠다</p>
                            <ul>
                                <li>심플리 키친</li>
                                <li>모미지 식당</li>
                                <li>서브웨이</li>
                            </ul>
                        </body>
                        </html>
                        """;


                pw.println("HTTP/1.1 200 OK");

                pw.println("content-type: text/html; charset=utf-8");
                pw.println("content-length: "+body.getBytes().length);

                pw.println();
                pw.println(body);

                pw.flush();
            }
        }


    }
}
