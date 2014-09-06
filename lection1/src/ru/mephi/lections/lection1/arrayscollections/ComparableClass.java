package ru.mephi.lections.lection1.arrayscollections;

/**
 * Created by Bazar on 05.09.14.
 */
public class ComparableClass implements Comparable<ComparableClass> {

    private Integer groupNumber;
    private String name;

    public ComparableClass(Integer groupNumber, String name) {
        this.groupNumber = groupNumber;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableClass o) {
        int result = 0;
        if (groupNumber == null) {
            if (o.groupNumber != null) {
                result = 1;
            }
        } else {
            result = groupNumber.compareTo(o.groupNumber);
        }
        if (result == 0) {
            if (name == null) {
                if (o.name != null) {
                    result = 1;
                }
            } else {
                result = name.compareTo(o.name);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ComparableClass{" +
                "groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
