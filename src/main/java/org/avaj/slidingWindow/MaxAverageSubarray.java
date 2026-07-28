package org.avaj.slidingWindow;

public class MaxAverageSubarray {
    public static double average(int [] nums, int k){

        int m = nums.length;

        int window_sum=0;
        int max_sum=0;

        for(int i=0; i<k; i++){
            window_sum+=nums[i];
        }
        max_sum=window_sum;
        for(int i=k; i<m; i++){
            window_sum+=nums[i] - nums[i-k];    //Maximum Average subarray i by fixed size
            max_sum=Math.max(window_sum,max_sum); // Time Complexity o(n)
        }
        return (double) max_sum / k;
    }

    public static void main(String[] args){
        int [] nums={1,12,-5,-6,50,3};

        int k = 4;

        double result=average(nums,k);

        System.out.print(result);

    }
}
