package org.avaj;

import java.util.Arrays;

public class MedianOfArray {
    public static int median(int [] arr){
        int n = arr.length;
        int median =0;
        double media=0;

            Arrays.sort(arr);


            if(n % 2 ==0){
                media = (arr[n/2] + arr[n/2] -1) / 2.0;
                System.out.print(media);

            }else{
                median = arr[n / 2];
                System.out.print(median);
            }

        return median;
    }
    public static void main(String[] args){
        int [] arr = {5,5,5};

        double result = median(arr);

        System.out.print(result);

    }
}
