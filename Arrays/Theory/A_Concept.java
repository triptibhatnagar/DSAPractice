package Arrays.Theory;

public class A_Concept {
    public static void main(String[] args) {
        //WHY WE NEED ARRAYS
        
        //Q: Store a roll no
        // int rollno = 1234;
        //Q: Store a person's name
        // String name = "Tripti";
        //Q: Store 5 roll nos
        // int rn1 = 12;
        // int rn2 = 34;
        // int rn3 = 56;
        // int rn4 = 78;
        // int rn5 = 90;

        //Q: Store 500 roll nos

        //ARRAY - collection of datatypes (primitive, objects, complex datatypes)

        //SYNTAX
        // datatype[] variable_name = new datatype[size];

        //Q: Store 5 roll nos
        int rollnos[] = new int[5];
        System.out.println(rollnos[3]);//0 -> default value for an integer array
        //or directly
        // int rollnos2[] = {12, 23, 34, 45, 56};
        

        //IMPORTANT POINTS
        /*
         * datatype represents type of data stored in array.
         * all the type of data in array should be same.
         * rollnos mean this reference variable is pointing to an array object that contains integer type elements.
        */

        // int rollnos3[];//declaration of array, rollno3 is getting defined in stack
        // rollnos3 = new int[5];//initialization, actual object is being created in heap memory

        //LHS - reference variable, stack, compiletime
        //RHS - object, heap , runtime => dynamic memory allocation(at execution or runtime, memory is allocated; assigning the m/m space during runtime)

        //CONTINUITY OF ARRAY
        //it totally depends on jvm whether array is continuous(one by one memory is allocated, nothing missing in b/w) or not

        /*
         * we know that objects are stored in heap
         * in JLS, it is mentioned that heap objects are not continuous
         * Heap is the runtime data area from which the m/m for all the classes and instances of all the arrays is allocated -> Dynamic Memory Allocation
         * => hence array objects in java may not be continuous
        */

        //INDEX OF ARRAY
        //position of array elements starting from 0
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[2] = 99;
        System.out.println(arr[2]);

        //NEW KEYWORD - used to create an object

        String strs[] = new String[5];
        System.out.println(strs[0]);//null -> default value for String array

        //NULL - special literal of null type, can be assigned to any reference type, can typecast null to any type, but not with primitives; special value literal by default value to what reference variables point to
        // String str = null;
        // int num1 = null;//cannot convert from null to int
    }
}