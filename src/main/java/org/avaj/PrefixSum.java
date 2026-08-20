package org.avaj;

class PrefixSum {
    public static void main(String[] args){
        int[] arr={34,56,78,90};

        int n = arr.length;

        int[] prefix = new int[n];

        // First element remains same
        prefix[0] = arr[0];

        for(int i=1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int nums : prefix){
            System.out.print(nums + " ");
        }

    }
}
