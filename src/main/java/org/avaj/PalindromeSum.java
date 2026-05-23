package org.avaj;


public class PalindromeSum {

    // Method to check palindrome
    public static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int[] arr = {121, 45, 131, 200, 99};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isPalindrome(arr[i])) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of palindrome numbers: " + sum);
    }
}