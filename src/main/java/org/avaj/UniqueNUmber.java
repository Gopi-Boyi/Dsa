package org.avaj;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNUmber {
    public static boolean number(int [] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int arr : nums){
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int frequency : map.values()){
            if(set.contains(frequency)){
                return false;
            }else {
                set.add(frequency);
            }
        }
        return true;
    }
    public static void main(String[] args){
        int [] nums = {1,2,2,3,3,3,4,4,4,4};

        boolean result = number(nums);

        System.out.print(result);
    }
}
