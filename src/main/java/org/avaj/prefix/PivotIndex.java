package org.avaj.prefix;

public class PivotIndex {
    public static int pivot(int[] nums){
        int totalSum =0;
        for(int num : nums){
            totalSum+=num;
        }
        int leftSum = 0;
        for(int i=0; i< nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return  -1;
    }
    public static void main(String[] args){
        int [] nums = {1,7,3,6,5,6};
        int result = pivot(nums);
        System.out.print(result);
    }
}
