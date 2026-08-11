package org.avaj.slidingWindow;

public class MaxConsecutiveOnesII {
    public static int max(int[] nums, int k){       //Max Consecutive Ones III
        int n = nums.length;
        int zeroCount=0;
        int left =0;
        for(int right=0; right<n; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            if(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return n - left;
    }
    public static void main(String[] args){
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1};
        int k = 2;
        int result = max(nums, k);
        System.out.print(result);
    }
}
