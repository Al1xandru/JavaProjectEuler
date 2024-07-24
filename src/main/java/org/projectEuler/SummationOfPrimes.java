package org.projectEuler;

public class SummationOfPrimes {
    public static void main(String[] args) {
        long result = 0;
        long number = 0;
        while (number < 2000000){
            number++;
            if(isPrime(number)){
                result += number;
            }
        }
        System.out.println("rezultatul este: " + result);
    }
    public static boolean isPrime(long number){
        if(number <= 1){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
