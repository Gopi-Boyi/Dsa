package org.avaj;

public class EvenOdd {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Even Index Sum = " + evenSum);
        System.out.println("Odd Index Sum = " + oddSum);
    }
}
