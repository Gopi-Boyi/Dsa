package org.avaj;

public class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9, 10};
        int target = 19;

        int[] result = twoSum(arr, target);

        System.out.print(result[0] + " " + result[1]);
    }
}
