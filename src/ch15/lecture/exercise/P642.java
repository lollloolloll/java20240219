package ch15.lecture.exercise;

import java.util.ArrayList;
import java.util.List;

public class P642 {
    public static void main(String[] args) {


        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size=list.size();
        System.out.println("총 객체 수" + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" +
                board.getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" +
                    b.getWriter());
        }
        System.out.println();

               list.remove(2);
               list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());

        }
        list.forEach(System.out::println);






    }
}

class Board {
    private String subject;
    private String content;
    private String writer;

    Board(String subject, String content, String writer) {
        this.subject=subject;
        this.content = content;
        this.writer = writer;
    }
    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject=subject;
    }
    String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content=content;
    }

    String getWriter() {
        return writer;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }
}
