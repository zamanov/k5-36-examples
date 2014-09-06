package ru.mephi.lections.lection1;

/**
 * Created by Bazar on 05.09.14.
 */
public class BasicTypes {

    private int primitiveInt = 1;
    private Integer objectInteger = 1;

    private String myString = "foo";

    public int getPrimitiveInt() {
        return primitiveInt;
    }

    public void setPrimitiveInt(int primitiveInt) {
        this.primitiveInt = primitiveInt;
    }

    public Integer getObjectInteger() {
        return objectInteger;
    }

    public void setObjectInteger(Integer objectInteger) {
        this.objectInteger = objectInteger;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public static void resetClass(BasicTypes basicTypes) {
        //basicTypes = new BasicTypes();
        basicTypes.setMyString("foo");
        basicTypes.setObjectInteger(1);
        basicTypes.setPrimitiveInt(1);
    }

    public static void main(String[] args) {
        BasicTypes basicTypes = new BasicTypes();
        System.out.println(basicTypes);
        basicTypes.setPrimitiveInt(2);
        basicTypes.setObjectInteger(Integer.parseInt("34"));
        System.out.println(basicTypes);
        basicTypes.setMyString(basicTypes.getObjectInteger().toString());
        System.out.println(basicTypes);
        resetClass(basicTypes);
        System.out.println(basicTypes);
    }

    @Override
    public String toString() {
        return "BasicTypes{" +
                "primitiveInt=" + primitiveInt +
                ", objectInteger=" + objectInteger +
                ", myString='" + myString + '\'' +
                '}';
    }
}
