package org.avaj;

public class LargestElement {
    public static void main(String[] args){

        int[] arr={12,34,56,78,98,56,122};

        int max=arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }                           //Time complexity o(n) loop runs n times
        System.out.println(max);
    }
}
