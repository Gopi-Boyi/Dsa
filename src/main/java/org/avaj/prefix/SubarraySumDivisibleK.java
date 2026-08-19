package org.avaj.prefix;

import java.util.HashMap;

//Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
//
//A subarray is a contiguous part of an array.
//
//
//
//        Example 1:
//
//Input: nums = [4,5,0,-2,-3,1], k = 5
//Output: 7
//Explanation: There are 7 subarrays with a sum divisible by k = 5:
//        [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
//Example 2:
//
//Input: nums = [5], k = 9
//Output: 0
public class SubarraySumDivisibleK {
    public static int divisible(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int n = nums.length;
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            prefixSum+=nums[i];
            int reminder = prefixSum % k;
            if(reminder < 0){
                reminder+=k;
            }
            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int [] nums = {4,5,0,-2,-3,1,};
        int k = 5;
        int result = divisible(nums,k);
        System.out.print(result);
    }
}
