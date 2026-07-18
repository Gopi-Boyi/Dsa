package org.avaj;

public class Palindrome {
    public static boolean check(String s){
            int n=s.length() -1;
            int left=0;
            int right=n;

            while(left < right){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
    public static void main(String[] args){
        String s = "OMOk";

        boolean M = check(s);
        System.out.print(M);

    }
}
