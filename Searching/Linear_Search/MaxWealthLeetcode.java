package Searching.Linear_Search;

public class MaxWealthLeetcode {
    /*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
    */
    public static void main(String[] args) {
        int arr[][] = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int arr[][]) {
        // person = row, accout = col
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int wealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                wealth += arr[i][j];
            }
            if(maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}