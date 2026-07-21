package org.avaj.slidingWindow;

public class MaxConsecutiveOnes {
    public static int MaxOnes(int[] arr){

        int n = arr.length;
        int max_count=0;
        int current_count=0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                current_count++;
            }else{
                max_count=Math.max(max_count,current_count);
                current_count=0;
            }
        }
        return Math.max(max_count, current_count);
    }
    public static void main(String[] args){
        int [] arr={1,1,1,0,1,1,1,1};

        int result=MaxOnes(arr);
        System.out.print(result);
    }
}
