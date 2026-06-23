package org.avaj;

public class Sorted
{
   public static boolean sort(int [] arr){
       int n = arr.length;
       for(int i=0; i<n-1; i++){
           if(arr[i] > arr[i+1]){
               return false;
           }

       }
       return true;
   }
   public static void main(String[] args){
       int[] arr={23,45,67,89,34,78};
       boolean result = sort(arr);
       System.out.print(result);
   }
}
