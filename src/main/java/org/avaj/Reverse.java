package org.avaj;

public class Reverse {
    public static void main(String[] args){
        int [] arr= {24,45,23,46,67,89};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
