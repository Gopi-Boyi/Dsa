package org.avaj;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size");
        int n =sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.getOrDefault(nums[i], 0)+ 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int arr : map.keySet()){
            System.out.println(arr + " : " + map.get(arr));
        }

    }
}
