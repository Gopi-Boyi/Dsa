package org.avaj.Strings;

public class CountTheWordsInString {
//    public static void main(String[] args){
//        String str = "Hello  java   Mawa";
//        String[] words = str.trim().split("\\s+");
//        System.out.print("Count of the Words " + " " + words.length);
//    }
    public static int count(String str){
        int n = str.length();
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) == ' ' )){
                count1++;
            }
        }
        return count1;
    }
    public static void main (String[] args){
        String str = "Hello  mawa  java";
        int reult = count(str);
        System.out.print(reult);
    }
}
