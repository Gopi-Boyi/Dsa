package org.avaj.MathLogic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arry {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int sum =0;

        int n = sc.nextInt();

        System.out.print("Enter Array");

        int[] nums = new  int[n];

        for(int i=0; i< nums.length; i++){
            sum+=nums[i];

            System.out.print(sum);
        }
        sc.close();
    }

}
