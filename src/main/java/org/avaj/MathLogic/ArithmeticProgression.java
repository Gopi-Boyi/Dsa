package org.avaj.MathLogic;

public class ArithmeticProgression {
    public static boolean arithmetic(int [] nums){
        int d = nums[1] - nums[0];

        for(int i=1; i< nums.length; i++){
            if(nums[i] - nums[i-1] != d){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args){
        int nums[] = {2, 5 ,8 ,11 ,14};
       if(arithmetic(nums)){
           System.out.print("True");
       }else{
           System.out.print("False");
       }
    }
}
