package org.avaj;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args){
        int[]  nums = {3,5,69,22,9,99};

        int n = nums.length;

        for(int i=0; i<n; i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);

        for(int arr : nums){
            System.out.print(arr + " ");
        }
    }
}
