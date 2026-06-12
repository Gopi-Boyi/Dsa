package org.avaj;

public class Sorted
{
    public static void main(String[] args){
        int [] num = {23,45,67,89};

        boolean isSorted = true;

        for(int i=0; i< num.length-1; i++){
            if(num[i]>num[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("is sorted");
        }else {
            System.out.println("is not sorted");
        }
    }
}
