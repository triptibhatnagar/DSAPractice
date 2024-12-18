package Strings.Theory;

import java.util.Arrays;

public class C_Output {
    public static void main(String[] args) {
        System.out.println(89);
        // println(int)
        // out : variable of type PrintStream, a class having a method println()
        // println() -> String.valueOf() -> Integer.toString()
        // in the end, its returning string only

        System.out.println("Hey");
        // println(String)
        // println() -> String.valueOf() -> obj.toString() -> Integer.toHexString()

        System.out.println(new int[]{1,2,3});// [I@2c7b84de
        // println(Object)
        // println() -> String.valueOf() -> obj.toString() -> Integer.toHexString()
        // null.toString() => NullPointerException
        // obj can be of many types, java don't know which obj to print, not told java explicitally that what to print - name, rollno etc., in that case for every object they have a default representation, it takes a hash code, adds @ to it and add some random characters.
        // It is a string/textual representation of the object but that is not very beneficial to us.
        // hence you can override toString() method to use it as Arrays.toString() - use the toString() available in Arrays
        System.out.println(Arrays.toString(new int[]{1,2,3}));// [1, 2, 3]

        // println(int), println(String), println(Object) = FUNCTION OVERLOADING

        // String name;
        String name = null;
        System.out.println(name);// null

        // System.out.println(56.toString);
        // Integer num =  new Integer(56);
        // System.out.println("From Wrapper class: "+num.toString());// From Wrapper class: 56
        // Wrapper class - to use all the object oriented programming principles with integer values because we know integers are stored in stack m/m and objects are stored in heap m/m
    }
}