package Strings.Theory;

import java.util.ArrayList;

public class E_Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//195 = Addition of ASCII values of characters
        //'a' = 97, 'b' = 98
        System.out.println("a"+"b");//ab = Concatenation of strings
        System.out.println('a'+3);//100
        System.out.println((char)('a'+3));//d = typecasting
        System.out.println("a"+3);//a3

        // When an integer is added with string, it is converted to its Wrapper class Integer that will call toString()
        // this is same as after a few steps : "a" + "3"

        System.out.println("Kunal"+new ArrayList<>());//Kunal[]
        System.out.println(new ArrayList<>());//[]
        // as array is empty, return empty array
        // System.out.println("Kunal"+new Integer(78));//Kunal78
        // if there is an object, it will be called toString()

        // System.out.println(new Integer(78)+new ArrayList<>());// Error : The operator + is undefined for the argument type(s) Integer, ArrayList<Object>

        // + is defined for only primitives or with any complex objects with only condition that any one of these values is a string ( and entire result is of String type)
        // System.out.println(new Integer(78)+""+new ArrayList<>());//78[]
        // String ans = new Integer(78)+" hey "+new ArrayList<>();
        // System.out.println(ans);//78 hey []

        // System.out.println("a"-"b");//operator - is undefined for the argument
        // - not work for strings

        // + operator overloading : + is giving us more functionality (concatenation) rather than addition
        /*
         * in java operator overloading is not supported for some s/w engg considerations because it results in poor code
         * in C++, operator overloading is supported, you can basically modify what the + operator is doing
         * like c++, it can be done in python
         */
        System.out.println("a"+'b');//ab
        //if any one of the data type is string answer will be string
    }
}