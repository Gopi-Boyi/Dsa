package org.avaj.MathLogic;

public class PrimeNumber {
    public static boolean primeNumberCheck(int n){
        if(n <= 1){
            return false;
        }

        for(int i=2; i*i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n =37;

        if(primeNumberCheck(n)){
            System.out.print("It is prime number");
        }
        else{
            System.out.print("It is not a prime number");
        }
    }
}
