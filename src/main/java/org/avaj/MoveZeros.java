package org.avaj;

import java.util.Arrays;

class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int pos=0;
        int i=0;
        while(i<nums.length){
            if(nums[i] !=0){
                nums[pos]=nums[i];
                pos++;
            }
            i++;
        }                                           //using two pointer approach t/c = o(n)
        while(pos<nums.length){
            nums[pos]=0;
            pos++;
        }
    }
    public static void main(String[] args){
        int[] nums={1,0,3,0,4,0,0};
        moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }
}
