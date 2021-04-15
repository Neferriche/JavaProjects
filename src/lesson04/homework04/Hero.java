package lesson04.homework04;

public class Hero {
    String name;
    int age;
    String weapon;
    int power;
    int speed;
    int intellect;

    public Hero (String name, int age, String weapon, int power, int speed, int intellect) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.power = power;
        this.speed = speed;
        this.intellect = intellect;
    }

    void hello() {
        System.out.println("- Hello, my name is " + name + "!");
    }

    void myAge() {
        System.out.println("- I'm " + age + ".");
    }

    void myWeapon() {
        System.out.println("- And as you see, I fight with my " + weapon + ".");
    }

    void myPower() {
        System.out.println("Power: " + power);
    }

    void mySpeed() {
        System.out.println("Speed: " + speed);
    }

    void myIntellect() {
        System.out.println("Intellect: " + intellect);
    }



}
