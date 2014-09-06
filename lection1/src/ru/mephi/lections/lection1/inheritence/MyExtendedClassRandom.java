package ru.mephi.lections.lection1.inheritence;

import java.util.Random;

/**
 * Created by Bazar on 05.09.14.
 */
public class MyExtendedClassRandom extends MyAbstractClass {

    private Random random = new Random();

    @Override
    public int getInt() {
        return random.nextInt();
    }
}
