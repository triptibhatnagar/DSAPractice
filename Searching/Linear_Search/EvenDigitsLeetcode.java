package Searching.Linear_Search;

public class EvenDigitsLeetcode {
    // Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int arr[] = {555,-9019,482,-1771,00};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // if((int)(Math.log10(arr[i])+1) % 2 == 0) {
            //     count++;
            // }

            int n = arr[i];
            int digits = 0;
            if(n == 0) {
                digits = 1;
            }
            if(n < 0) {
                n = n*(-1);
            }
            while (n>0) {
                digits++;
                n=n/10;
            }
            if(digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}