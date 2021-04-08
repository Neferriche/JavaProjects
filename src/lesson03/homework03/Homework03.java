package lesson03.homework03;

import java.beans.PropertyEditorSupport;
import java.util.Random;
import java.util.Scanner;

public class Homework03 {

    public static char[][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createField() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Введите координаты клетки для хода: ");
            cellX = scanner.nextInt() - 1;
            cellY = scanner.nextInt() - 1;
        } while (!validCell(cellY, cellX) || !emptyCell(cellY, cellX));
        field[cellY][cellX] = human;
    }

    public static void turnAi() {
        int cellX;
        int cellY;

        do {
            cellX = random.nextInt(fieldSizeX);
            cellY = random.nextInt(fieldSizeY);
        } while (!emptyCell(cellY, cellX));
        field[cellY][cellX] = ai;
    }

    public static boolean winGame(char player) {
        return checkLines(player) ||
        checkDiagonal(player);
    }

    public static boolean checkLines(char player) {
        boolean checkY = true;
        boolean checkX = true;
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                checkY &= (field[y][x] == player);
                checkX &= (field[x][y] == player);
            }
            if (checkY || checkX) return true;
        }
        return false;
    }

    public static boolean checkDiagonal(char player) {
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        for (int y = 0; y < fieldSizeY; y++) {
            diagonal1 &= (field[y][y] == player);
            diagonal2 &= (field[4 - y][y] == player);
        }
        if (diagonal1 || diagonal2) return true;
        return false;
    }

    public static boolean tie() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSizeX && cellY >= 0 && cellY < fieldSizeY;
    }

    public static boolean emptyCell(int cellY, int cellX) {
        return field[cellY][cellX] == empty;
    }

    public static void main(String[] args) {

        createField();
        viewField();

        while (true) {
            turnHuman();
            viewField();
            if (winGame(human)) {
            System.out.println("Победа за Вами!");
            break;
            }
            if (tie()) {
                System.out.println("Ничья!");
                break;
            }

            turnAi();
            viewField();
            if (winGame(ai)) {
            System.out.println("Победа за Компьютером!");
            break;
            }
            if (tie()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}
