package org.avaj.MathLogic;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size");
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }                                       //2, 6, 18, 54, 162
        int r = nums[1] / nums[0];

        for(int i=2; i< nums.length; i++){
            if(nums[i] / nums[i-1] != r){
                System.out.print("It's Not a Geometric Progression");
            }else{
                System.out.print("It's a Geometric Progression");
            }
        }
    }
}
