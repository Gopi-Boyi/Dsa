package org.avaj.Strings;

public class ReverseString {
    public static void main(String[] args){
        String st = "gopi";
        String rev = "";
        for(int i=st.length()-1; i>=0; i--){
            rev+=st.charAt(i);
        }
        System.out.print(rev);
    }
}
