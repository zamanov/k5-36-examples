package ru.mephi.lections.lection1.arrayscollections;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Bazar on 05.09.14.
 */
public class ArraysExample {

    public static final int size = 30;
    public static final int smallSize = 5;

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 121, 7, 18};
        //вывод ссылки
        System.out.println(intArray);
        //вывод содержимого
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        intArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            intArray[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(intArray));
        ComparableClass[] classes = new ComparableClass[smallSize];
        for (int i = 0; i < smallSize; ++i) {
            ComparableClass comparableClass = new ComparableClass(random.nextInt() % 2, "" + random.nextInt());
            classes[i] = comparableClass;
        }
        System.out.println(Arrays.toString(classes));
        Arrays.sort(classes);
        System.out.println(Arrays.toString(classes));

    }

}
