package Strings.Theory;

public class B_Comparison {
    public static void main(String[] args) {
        // HOW TO CHECK WHETHER
        /*
         * Option A) - creating 2 different "Tripti" objects
         * OR
         * Option B) - both reference variables pointing to same "Tripti" object
        */
        String a = "Tripti";
        String b = "Tripti";
        // This is string pool as values are same but PROOF=?
        // ==
        System.out.println(a == b);// true

        //COMPARISON OF STRINGS
        /*
         * 1) == (comparator) method: checks if reference variables are pointing to same object
         *      a ----> "Tripti"     |   a,b ----> "Tripti"
         *      b ----> "Tripti"     | 
         *      == will give false   |   == will give true
         * 
         * 2) THEN, HOW TO CREATE DIFFERENT OBJECTS OF SAME VALUE?
         * tell java explicitly
         * String a = new String("Tripti");
         * String b = new String("Tripti");
         * Creating these values outside the pool but in heap
         * 
         * => When you only need to check value, use .equals() method
         * => When you need to check if reference variables are pointing to same object, use == operator
        */

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);// false
        System.out.println(str1.equals(str2));// true

        // System.out.println(str1[0]);
        // even though a string is a collection of characters, but we can't do this
        System.out.println(str1.charAt(0));// H
        // Internally it is working like array only, but for us it is string object type

        // COMMANDLINE ARGUMENTS - Stored in String args[]
    }
}