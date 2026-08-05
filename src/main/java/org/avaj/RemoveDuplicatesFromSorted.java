package org.avaj;

public class RemoveDuplicatesFromSorted {
    public static int remove(int[] arr){
        if(arr.length == 0)
            return 0;

        int n = arr.length;

        int i=0;

        for(int j=1; j<n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3};
        int k = remove(arr);
        System.out.println("Number of Unique Elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int j = 0; j < k; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
