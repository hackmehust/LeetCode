package CorrectTask;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (richest < sum) {
                richest = sum;
            }
        }
        return richest;
    };

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}
