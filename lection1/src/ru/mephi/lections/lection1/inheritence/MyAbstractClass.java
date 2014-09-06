package ru.mephi.lections.lection1.inheritence;

/**
 * Created by Bazar on 05.09.14.
 */
public abstract class MyAbstractClass implements IMyInterfaceExample {

    @Override
    public String getText() {
        return "Number:" + getInt();
    }

    public abstract int getInt();

}
