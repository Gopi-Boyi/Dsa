package org.avaj;

public class SuffixSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        int[] suffix = new int[n];

        // Last element remains same
        suffix[n - 1] = arr[n - 1];

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        // Print suffix sum array
        System.out.println("Suffix Sum Array:");

        for (int num : suffix) {
            System.out.print(num + " ");
        }
    }
}
