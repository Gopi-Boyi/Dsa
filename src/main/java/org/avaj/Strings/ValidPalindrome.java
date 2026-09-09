package org.avaj.Strings;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.

public class ValidPalindrome {
    public static boolean palindrome(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            char l = str.charAt(left);
            char r = str.charAt(right);

            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if(!Character.isLetterOrDigit(r)){
                right--;
            }else{
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str= "race a car";
        boolean result = palindrome(str);
        System.out.print(result);
    }

}
