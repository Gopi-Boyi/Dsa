package org.avaj;

public class Bubble {
    public static void main(String[] args) {


        int num[] = {23, 54, 67, 9, 23};
        int size = num.length;
        int temp = 0;

        System.out.println("Before Sorting.. !");
        for (int nums : num) {
            System.out.print(nums + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }
            }
            System.out.println();

            for (int nums : num) {
                System.out.print(nums + " ");
            }
        }
        System.out.println(" ");
        System.out.println("After Shorting.....");

        for (int nums : num) {
            System.out.print(nums + " ");

        }
    }
}
