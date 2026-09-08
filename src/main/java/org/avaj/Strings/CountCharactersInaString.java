package org.avaj.Strings;

public class CountCharactersInaString {
    public static void main(String[] args){
        String str = "Hello Java";
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.print("Count of the String" + " "+ count);
    }
}
