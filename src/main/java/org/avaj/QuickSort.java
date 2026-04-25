package org.avaj;

public class QuickSort {

    public static  void quickSort(int [] arr, int low, int high){
        if(low<high){
            //Calls the partition function.
             int pi = partition(arr, low, high);

            // Recursively sorts the left side of pivot.
             quickSort(arr, low,pi-1);
            // Recursively sorts the right side of pivot.
             quickSort(arr, pi+1, high);
        }
    }
    private  static int partition(int[] arr, int low, int high){
        int pivot=arr[high];// last element as pivot
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;

                // swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // place pivot in correct position
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public  static void main(String[] args){
        int arr[]={10,16,8,12,15,6,3,9,5};

        quickSort(arr,0, arr.length-1); //time com o(n log n) becus we using one for loop

        for(int nums: arr){
            System.out.print(nums+ " ");
        }
    }
}
