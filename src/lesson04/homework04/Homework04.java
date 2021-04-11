package lesson04.homework04;

public class Homework04 {

    public static <heroes> void main(String[] args) {

        Hero[] heroes = new Hero[5];
        heroes[0] = new Hero("Donatello", 14, "Tech-bo", 7, 4, 10);
        heroes[1] = new Hero("Splinter", 45, "Stick", 9, 8, 6);
        heroes[2] = new Hero("April", 16, "Bat", 8, 6, 7);
        heroes[3] = new Hero("Shredder", 542, "Claws", 10, 9, 6);
        heroes[4] = new Hero("Draxum", 610, "Vines",9, 6, 10);

        heroes[0].hello();
        heroes[0].myAge();
        heroes[0].myWeapon();
//        System.out.println("Look at my characteristics:");
//        heroes[0].myPower();
//        heroes[0].mySpeed();
//        heroes[0].myIntellect();

        System.out.println();

        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].age > 500) {
                System.out.println(heroes[i].name + " is more than 500 years old.");
            }
        }
    }
}
