package org.avaj;

class PrefixSum {
    public static void main(String[] args){
        int[] arr={34,56,78,90};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i=1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int nums : prefix){
            System.out.print(nums + " ");
        }

    }
}
