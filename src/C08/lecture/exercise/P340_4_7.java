package C08.lecture.exercise;

public class P340_4_7 implements Remocon{
    public static void main(String[] args) {

//******************5번****************************
        Remocon r = new P340_4_7();
        r.powerOn();
        //**************6번******************
        SoundableExample soundableExample = new SoundableExample();
        soundableExample.printSound(new Cat());
        soundableExample.printSound(new Dog());
//********************7번*********************
        DaoExample d = new DaoExample();

        d.dbWork(new OracleDao());
        d.dbWork(new MySqlDao());




    }

    @Override
    public void powerOn() {
        System.out.println("Tv를 켰습니다");
    }
}

interface Remocon {
    void powerOn();
}

interface Soundable {
    String sound();
}

class SoundableExample {
    static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "bowowbowowbowow";
    }
}

class Cat implements Soundable {

    @Override
    public String sound() {
        return "meowwwwwwwwwwwwww";
    }


}

class DaoExample {
    static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();

    }
}

class OracleDao implements DataAccessObject{

    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB에서 삭제");
    }
}

class MySqlDao implements DataAccessObject{

    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySql DB에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql DB에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }
}

interface DataAccessObject {
    void select();
    void insert();
    void update();
    void delete();
}
