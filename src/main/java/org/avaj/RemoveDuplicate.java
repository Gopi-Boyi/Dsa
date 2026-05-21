package org.avaj;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args){
        int [] arr={23,45,23,45,89,67,89,};

        HashSet<Integer> set = new HashSet<>();

        for( int nums : arr){
            set.add(nums);
        }
        System.out.print(set);
    }
}
