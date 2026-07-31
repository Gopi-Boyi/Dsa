package org.avaj;

public class AverageOfArray
{
    public static void main(String[] args){

        int[] nums = {5,5,5,5};

        int n = nums.length;
        int sum =0;

        for(int i=0; i<n; i++){
            sum+=nums[i];


        }
        int result = sum /2;
        System.out.print(result);
    }
}
