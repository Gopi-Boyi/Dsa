package org.avaj.MathLogic;

import jdk.jshell.execution.JdiDefaultExecutionControl;

public class ReverseElements {
    public static void main(String[] args){
        int n = 2147483644;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;

            n = n / 10;

            if(rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && digit > 7){
                System.out.print("0");
            }
            if(rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE /10 && digit < -8){
                System.out.print("0");
            }
            rev = rev * 10 + digit;
        }
    System.out.print(rev);
    }
}
