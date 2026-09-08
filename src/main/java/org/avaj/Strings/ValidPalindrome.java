//package org.avaj.Strings;
//
//public class ValidPalindrome {
//    public static boolean palindrome(String st){
//        int left = 0;
//        int right = st.length()-1;
//
//        while(left<right){
//            char l = st.charAt(left);
//            char r = st.charAt(right);
//
//            if(!isLetterOrDigit.charAt(l)){
//                left++;
//            }else if(!isLetterOrDigit.charAt(r)){
//                right--;
//            }else{
//                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
//                    return false;
//                }
//                left++;
//                right--;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        String st = "a pan apa";
//        boolean result= palindrome(st);
//        System.out.print(result);
//    }
//}
