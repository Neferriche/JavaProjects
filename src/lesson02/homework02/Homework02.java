package lesson02.homework02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework02 {
    public static void main(String[] args){
        int[] array1 = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
        inverse(array1);
        System.out.println("1. " + Arrays.toString(array1));

        int[] array2 = new int[8];
        fillIn(array2);
        System.out.println("2. " + Arrays.toString(array2));

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply(array3);
        System.out.println("3. " + Arrays.toString(array3));

        int[] array4 = {2, 15, 47, 63, 12, 8, 25, 19, 38, -8, 6};
        System.out.println("4.1. Min is " + minimum(array4));
        System.out.println("4.2. Max is " + maximum(array4));

    }
    public static void inverse(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }
    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3 + 1;
        }
    }
    public static void multiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }
    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }
}
