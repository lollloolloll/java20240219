package ch15.lecture.exercise;

import java.util.ArrayList;
import java.util.List;

public class P688_7 {
    public static void main(String[] args) {
        BoardDao dao=new BoardDao();
        List<Board7> list=dao.getBoardList();
        for (Board7 board : list) {
            System.out.println(board.getTitle() + "-"
                    + board.getContent());
        }
        }




    }


class Board7 {
    private String title;
    private String content;

    public Board7(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class BoardDao {
    public List<Board7> getBoardList() {
        List<Board7> list = new ArrayList<>();
        list.add(new Board7("제목1", "내용1"));
        list.add(new Board7("제목2", "내용2"));
        list.add(new Board7("제목3", "내용3"));

        return list;

    }
}
