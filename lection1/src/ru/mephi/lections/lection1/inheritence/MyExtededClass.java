package ru.mephi.lections.lection1.inheritence;

/**
 * Created by Bazar on 05.09.14.
 */
public class MyExtededClass extends MyExtendedClassZero {

    @Override
    public String getText() {
        return super.getText() + "(zero)";
    }
}
