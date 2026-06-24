package org.avaj;

import java.util.Arrays;

public class SortColours {
    public static int[] color(int[] nums){
        int n = nums.length;
        int low=0, mid=0;
        int high=n-1;

        while (mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int []  nums={0,2,1,0,1,2,0,2,1};
        int[] result = color(nums);
        System.out.print(Arrays.toString(result));
    }
}
