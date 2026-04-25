package org.avaj;

public class Selection {
    public static void main(String[] args) {

    int arr[] = {23,56,34,56,98,90};

    System.out.println("Before Sorting");
    for(int nums : arr){
        System.out.print(nums + " ");
    }
    for(int i=0; i<arr.length-1; i++){

        int minIndex = i;
        for(int j=i+1; j< arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

    }
    System.out.println();
    System.out.println("After Sorting");
    for(int nums : arr){
        System.out.print(nums + " ");
    }
    }
}