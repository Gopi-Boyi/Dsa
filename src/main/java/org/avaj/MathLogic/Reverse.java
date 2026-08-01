public class Reverse {
    public static void main(String[] args){
        String str = "Gopi";

        String tr = new StringBuilder(str).reverse().toString();

        System.out.print(tr);

    }
}