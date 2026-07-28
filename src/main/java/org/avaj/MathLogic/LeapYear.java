package org.avaj.MathLogic;

public class LeapYear
{
    public static String leap(int n){
        if(n%400 == 0){
            return "It's a Leap Year";
        } else if (n%4 ==0 && n%100 !=0) {
            return "It's a Leap Year";
        }else
            return "It's not a leap year";

    }
    public static void main (String[] args){
        int n = 2008;

        String result=leap(n);

        System.out.print(result);
    }

}
