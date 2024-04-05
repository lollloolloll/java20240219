package ch18.lecture.exercise;

import java.io.IOException;

public class P486_8 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.writes("데이터");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class FileWriter implements AutoCloseable {
    private String filePath;

    public FileWriter(String filePath) throws IOException {
        this.filePath = filePath;
        System.out.println(filePath + " 파일을 엽니다");
    }

    void writes(String data) throws IOException {
        System.out.println(data + "를 파일에 저장합니다");
    }

    @Override
    public void close() throws Exception {
        System.out.println("파일을 닫습니다");
    }
}
