package ru.mephi.lections.lection1;

/**
 * Created by Bazar on 05.09.14.
 */
public class BasicConstructions {

    private int myInt = 0;

    public BasicConstructions() {
    }

    public BasicConstructions(int myInt) {
        this.myInt = myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }


    //сравнение
    public String compare() {
        if (myInt == 0) {
            return "My int equals 0";
        } else {
            return "My int is not 0";
        }
    }

    //сравнение строк
    public void compareStrings(String arg) {
        //Не правильно
        if (arg == "LoL") {
            System.out.print("LoL,");
        }
        //Правильно
        if ("LoL".equals(arg)) {
            System.out.println("LoL");
        }
        //Не безопасно
        if (arg.equals("LoL")) {
            System.out.println("!");
        }
    }

    //Конструкция switch
    public void showSwitch(int selection) {
        switch (selection) {
            case 0:
                System.out.println("Case 0");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("dafault");
                break;
        }
    }

    //цикл for
    public void cicleFor(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.println("turn " + i);
        }
    }

    //Цикл wile
    public void cileWhile(int number) {
        while (number > 0) {
            System.out.println(number-- + " left");
        }
    }

    public static void main(String[] args) {
        //Создание экземпляра класса
        BasicConstructions basicConstructions = new BasicConstructions();

        //Вызов метода
        System.out.println(basicConstructions.compare());

        //Установка переменной
        basicConstructions.setMyInt(3);
        System.out.println(basicConstructions.compare());

        //Использование параметризованного конструктора
        basicConstructions = new BasicConstructions(5);
        System.out.println(basicConstructions.compare());

        //Сравнение с другой константой
        basicConstructions.compareStrings("LoL");

        //Сравнение с сгенерированным значением
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("L").append("o").append("L");
        System.out.println("Sb value " + stringBuilder.toString());
        basicConstructions.compareStrings(stringBuilder.toString());

        //свитч и циклы
        basicConstructions.showSwitch(2);
        basicConstructions.cicleFor(5);
        basicConstructions.cileWhile(8);
    }

}
