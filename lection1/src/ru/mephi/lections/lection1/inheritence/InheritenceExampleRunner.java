package ru.mephi.lections.lection1.inheritence;

import java.util.Random;

/**
 * Created by Bazar on 05.09.14.
 */
public class InheritenceExampleRunner {

    private static final int size = 50;

    public static void main(String[] args) {
        IMyInterfaceExample[] myInterfaceExamples = new IMyInterfaceExample[size];
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            int flag = Math.abs(random.nextInt() % 5);
            if (flag == 0) {
                myInterfaceExamples[i] = new MyInterfaceExampleFoo();
            } else if (flag == 1) {
                myInterfaceExamples[i] = new MyInterfaceExampleBar();
            } else if (flag == 2) {
                myInterfaceExamples[i] = new MyExtendedClassZero();
            } else if (flag == 3) {
                myInterfaceExamples[i] = new MyExtendedClassRandom();
            } else {
                myInterfaceExamples[i] = new MyExtededClass();
            }
        }
        for (IMyInterfaceExample myInterfaceExample : myInterfaceExamples) {
            System.out.println(myInterfaceExample.getText());
        }
    }

}
