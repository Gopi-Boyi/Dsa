package org.avaj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumberOccurrences {
    public   static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        //Frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int arr : nums){
            map.put(arr, map.getOrDefault(arr, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : map.values()){
                if(set.add(x)){
                    System.out.println("false");
                }else{
                    set.add(x);
                }
        }

    }
}
