package org.projectEuler;

public class TenThousandAndOneStPrime {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        while (count < 10001){
            number++;
            if(isPrime(number)){
                count++;
            }
        }
        System.out.println(number);
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
