package org.avaj.prefix;

import java.util.HashMap;

//Example 1:
//
//Input: nums = [23,2,4,6,7], k = 6
//Output: true
//Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
//Example 2:
//
//Input: nums = [23,2,6,4,7], k = 6
//Output: true
//Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
//        42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
public class ContinuousSubarraySum {
    public static boolean subarray(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int prefixSum =0;
        for(int i=0; i<n; i++){
            prefixSum+=nums[i];
            int rem = prefixSum % k;
            if(map.containsKey(rem)){
                if(i - map.get(rem) >= 2){
                    return true;
                }
            }else{                                     //Prefix Pattern With HAshMap
                map.put(rem,i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,7,3,9};
        int k =6;
        boolean result = subarray(nums, k);
        System.out.print(result);
    }
}
