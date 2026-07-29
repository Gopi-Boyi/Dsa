package org.avaj;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter an Size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter an Array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            //secondSmallest

            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] <  secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] >  secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        System.out.println("SecondSmallest : " + secondSmallest);
        System.out.println("SecondLargest : " + secondLargest);
    }
}
