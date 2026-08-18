package org.avaj.prefix;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
public class ProductArrayExceptSelf {
    public static int[] self(int[] nums){
        int n =nums.length;
        int[] answer = new int[n];

        answer[0] = 1;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }
    public static void main(String[] args){
        int[] nums = {2,3,4,5,6};
        System.out.print(Arrays.toString(self(nums)));
    }
}
