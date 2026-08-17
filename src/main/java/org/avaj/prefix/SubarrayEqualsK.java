package org.avaj.prefix;

import java.util.HashMap;

public class SubarrayEqualsK { //SUB ARRAY SUM EQUALS K
        public static int sub(int[] nums, int k ){
            HashMap<Integer,Integer> map = new HashMap<>();

            map.put(0,1);
            int count =0;
            int prefixSum =0;
            for(int arr : nums){
                prefixSum+=arr;

                if(map.containsKey(prefixSum - k)){
                    count+=map.get(prefixSum - k);
                }
                map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
            }
            return count;
        }
        public static void main (String[] args){
            int[] nums = {2,5,4,8,5,9};
            int k = 5;
            int result = sub(nums , k);
            System.out.print(result);
        }
}
