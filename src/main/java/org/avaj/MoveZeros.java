package org.avaj;

import java.util.Arrays;

class MoveZeros {
    public static void moveZeroes(int[] nums) {
       int n = nums.length;
       int left=0;
       for(int right=0; right<n; right++){
           if(nums[right] != 0) {
               int temp = nums[right];
               nums[right] = nums[left];
               nums[left] = temp;
               left++;
           }
       }
    }
    public static void main(String[] args){
        int[] nums={1,0,3,0,4,0,0};
        moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }
}
