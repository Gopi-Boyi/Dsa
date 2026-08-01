package org.avaj;

public class TwoPointerString {
    public static void main(String[] args){

        String str = "Krishnahh";

        char[] arr = str.toCharArray();

        int start =0;                               //TImeC o(n) space o(n)
        int end =str.length()-1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;

        }
        System.out.print(new String(arr));

    }

}
