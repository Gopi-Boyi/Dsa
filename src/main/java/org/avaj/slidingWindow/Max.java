package org.avaj.slidingWindow;

public class Max {
    public static int silding(int [] arr, int k){
        int maxSum=0;
        int windowMax=0;

        for(int i=0; i<k; i++){
            windowMax+=arr[i];          //SLIDING WINDOW FIXED SIZE time complexity o(n)
        }
        maxSum=windowMax;
        for(int i=k; i< arr.length; i++){
            windowMax+=arr[i];
            windowMax-=arr[i-k];
            maxSum=Math.max(maxSum, windowMax);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7};
        int k = 2;

        int result = silding(arr,k);
        System.out.print(result);
    }
}
