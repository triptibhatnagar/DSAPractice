package Strings.Theory;

public class D_PrettyPrinting {
    public static void main(String[] args) {
        float a  = 82749.8762f;
        System.out.printf("Formatted number till 2 digit decimal no. : %.2f", a);//Formatted number till 2 digit decimal no. : 82749.88
        System.out.println("\n"+Math.PI);// 3.141592653589793
        System.out.printf("%.3f",Math.PI);//3.142

        System.out.printf("\n"+"Hello my name is %s and I am %s","Kunal","Cool");//order matters
        //order of variables/values same as order of placeholders
        
        //FORMAT SPECIFIERS:-
        /*
         * %c - Character
         * %d - Decimal(base 10)
         * %e - Exponential floating-point number
         * %f - Floating-point number
         * %i - Integer(base 10)
         * %o - Octal number(base 8)
         * %s - String
         * %u - Unsigned decimal (integer) number
         * %x - Hexadecimal number(base 16)
         * %t - Date/time
         * %n - Newline
         */
    }
}