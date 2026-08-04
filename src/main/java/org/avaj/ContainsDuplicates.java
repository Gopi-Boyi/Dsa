package org.avaj;

import java.util.HashSet;

public class ContainsDuplicates
{
    public static boolean duplicates(int[] nums){
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {2,2,6,3,4,5,6};

        System.out.print(duplicates(nums));
    }
}
