package ch14.lecture.p1thread;

import java.util.List;
import java.util.Vector;

public class P645 {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                list.add(new Board("제목" + i, "content" + i, "writer" + i));
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 1001; i < 2000; i++) {
                list.add(new Board("제목" + i, "content" + i, "writer" + i));
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int size = list.size();
        System.out.println("총 객체수: " + size);
    }
}

class Board {
    private String title;
    private String content;
    private String writer;

    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
