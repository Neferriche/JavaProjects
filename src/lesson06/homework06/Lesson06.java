package lesson06.homework06;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 12.04.2021
 */

public class Lesson06 extends Object {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {

        LightHero lightHero = new LightHero("LightHero", 5, 100, 20);
        DarkHero darkHero = new DarkHero("DarkHero", 10, 150, 5);
        LightHealer lightHealer = new LightHealer("LightHealer", 2, 70, 4, 30);

        while (!lightHero.isDead() || !darkHero.isDead()) {
            System.out.println("**** Round " + round + " ****");

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());

            lightHero.attack(darkHero);

            if (darkHero.isDead()) {
                System.out.println("lightHero win");
                break;
            }

            darkHero.attack(lightHero);

            if (lightHero.isDead()) {
                System.out.println("darkHero win");
                break;
            }

            lightHero.healSelf();
            darkHero.healSelf();

            if (lightHero.health < 100) {
                lightHealer.healOther(lightHero);
            }

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            round++;

            Thread.sleep(5000);
        }

    }

/**
 * 1. Посмотреть все предыдущие уроки в части кода: 1-6 уроки
 * 2. Вопросы в комментарии к домашней работе
 * 3. Модифицировать код в части работы с объектами.
 * 4. Тренировка по тестам Java
 */

}
