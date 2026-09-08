package org.avaj.Strings;

public class RemoveSpacesfromString {
//    public static void main(String[] args){
//        String str = " Java is  the   language ";
//       String words = str.replace(" ", "");
//        String word = str.replaceAll("\\s+", "");
//        System.out.print(word);
//    }
    public static String remove(String str){
        int n = str.length();
        String result="";
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                result+=ch;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str = "JAva  Is the  Lanuguage";
        String st = remove(str);
        System.out.print(st);
    }
}
