package org.avaj.slidingWindow;

public class SubarrayProductLessThanK {
    public static int prod(int[] nums, int k){
        if(k <= 1) return 0;
        int n= nums.length;
        int count=0;
        int prod=1;
        int left=0;

        for(int right=0; right<n; right++){
            prod*=nums[right];

            while (prod >= k ){
                prod /= nums[left];
                left++;
            }
            count+= right - left + 1;
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {23,45,67,89,98,76,54,32,12};
        int k = 224000;

        int result = prod(nums , k);
        System.out.print(result);
    }
}
