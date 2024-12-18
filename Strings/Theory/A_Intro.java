package Strings.Theory;

public class A_Intro {
    public static void main(String[] args) {
        // "suryansh" => String, collection or sequence of characters
        // int a = 10;
        // reference var a pointing to 10, stored in stack memory
        // int arr[] = {2, 3, 5, 4, 10};
        // arr in stack, pointing to the object {2, 3, 5, 4, 10} in heap
        String str = "Suryansh Bhatnagar";
        System.out.println(str);

        //INTERNAL WORKING OF STRING
        /*
         * String name = "Suryansh Bhatnagar"
         * String - most commonly used class in Java's class library
         * every String - object of type String
         * name = reference variable, "Suryansh Bhatnagar" = object, String = datatype
        */
        // String a = "Tripti";
        // String b = "Tripti";
        /*
         * Option A) - creating 2 different "Tripti" objects
         * OR
         * Option B) - both reference variables pointing to same "Tripti" object
        */

        //2 CONCEPTS - I) STRING POOL II) IMMUTABILITY
        /*
         * STRING POOL
         * separate memory structure inside the heap
         * optimizatio pov
         * usecase : all the similar values of strings are not recreated in pool, makes our program more optimized
         * Option B)
        */

        // trying to change the original object via any one of the reference variable, it is going to change for all of these but this is not the case with strings. Reason: Immutablity 

        // IMMUTABILITY
        // you can't change the object because strings are immutable in java
        // why strings are immutable : for security reasons
        String name = "Tripti";
        name = "Bhatnagar";
        System.out.println(name);// Bhatnagar
        // here, new object is created "Bhatnagar", no change is done with previous one "Tripti" <= immutability
        // previous one will be removed by garbage collection
    }
}