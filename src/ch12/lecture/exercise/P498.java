package ch12.lecture.exercise;

public class P498 {
    public static void main(String[] args) {

        Member498 obj1 = new Member498("blue");
        Member498 obj2 = new Member498("blue");
        Member498 obj3 = new Member498("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다");
        } else {
            System.out.println("ob1과 obj2는 동등하지 않습니다");
        }
        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동등합니다");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다");
        }




    }
}

class Member498 {
    private String id;

    public Member498(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member498 target) {
            if (id.equals(target.getId())) {
                return true;
            }
        }
        return false;
    }
}


