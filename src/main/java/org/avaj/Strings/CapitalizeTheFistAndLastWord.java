package org.avaj.Strings;

public class CapitalizeTheFistAndLastWord {
    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        char[] ch = null;
        for (String word : words) {
           ch = word.toCharArray();

            ch[0] = Character.toUpperCase(ch[0]);
            ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);
        }
        System.out.print(new String(ch) + " ");
    }

}
