package org.avaj;

class CheckingArraySortedOrNot {
    public static boolean  sortedOrNot(int [] arr){
        int n = arr.length-1;

        for(int i = 0; i<n; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args){
        int[] arr={34,56,78,60};

         if(sortedOrNot(arr)){
             System.out.print("Array is sorted");
         }else{
             System.out.print("Array is not Sorted");
         }
    }
}
