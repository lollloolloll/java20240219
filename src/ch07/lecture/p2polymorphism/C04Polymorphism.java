package ch07.lecture.p2polymorphism;

public class C04Polymorphism {

    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println("..게임진행..");
        hero.setWeapon(new Bow());
        System.out.println("공격");
        hero.attack();


        System.out.println("총 획득");
        hero.setWeapon(new Gun());
        System.out.println("공격");
        hero.attack();

        System.out.println("탱크 획득");
        hero.setWeapon(new Tank());
        System.out.println("공격");
        hero.attack();

    }


}

class Weapon {
    public void trigger() {
        System.out.println("무기 발사");

    }
}

class Bow extends Weapon {
    @Override
    public void trigger() {
        System.out.println("화살 발사");
    }
}

class Gun extends Weapon {
    @Override
    public void trigger() {
        System.out.println("총알 발사");
    }
}

class Tank extends Weapon{
//    public void trigger() {
//        System.out.println("폭탄받아라");
//    }
}

class Hero {
    private Weapon weapon;

    void setWeapon(Weapon weapon) {
        this.weapon=weapon;
    }
    void attack() {
        weapon.trigger();

    }

}
