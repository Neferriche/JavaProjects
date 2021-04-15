package lesson05.homework05;

import java.util.Scanner;

public class Competition {

    public static void main(String[] args) {

        Dog dog = new Dog("Собака", 500, 10, 0.5F);
        Cat cat = new Cat("Кошка", 200, 0, 2);
        Bird bird = new Bird("Птица", 5, 0, 0.2F);
        Horse horse = new Horse("Лошадь", 1500, 100, 3);

        Animal[] arr = {dog, cat, bird, horse};

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите расстояние для бега:");
        float dist1 = sc1.nextFloat();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].run(dist1)) {
                System.out.println(arr[i].species + " пробежала " + dist1 + " м.");
            } else {
                System.out.println(arr[i].species + " не смогла пробежать " + dist1 + " м.");
            }
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите расстояние для плавания:");
        float dist2 = sc2.nextFloat();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].swim(dist2)) {
                System.out.println(arr[i].species  + " проплыла " + dist2 + " м.");
            } else if (arr[i].species.equals("Кошка") || arr[i].species.equals("Птица")) {
                System.out.println(arr[i].species + " не умеет плавать.");
            } else {
                System.out.println(arr[i].species  + " не смогла проплыть " + dist2 + " м.");
            }
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите высоту для прыжка:");
        float dist3 = sc3.nextFloat();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].jump(dist3)) {
                System.out.println(arr[i].species + " прыгнула на " + dist3 + " м.");
            } else {
                System.out.println(arr[i].species + " не смогла прыгнуть на " + dist3 + " м.");
            }
        }
    }
}
