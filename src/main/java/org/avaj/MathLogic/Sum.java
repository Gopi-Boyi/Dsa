package org.avaj.MathLogic;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long max = 0;

        for (int i = 0; i < n; i++) {

            long sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                max = Math.max(max, sum % m);
            }
        }

        System.out.println(max);

        sc.close();
    }
}
