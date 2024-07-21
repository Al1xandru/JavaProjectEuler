package org.projectEuler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println(largestPrimeFactor(number));
    }
    public static long largestPrimeFactor(long n){
        long largestFactor = -1;
        while(n % 2 == 0){
            largestFactor = 2;
            n /= 2;
        }
        for(long i = 3; i < Math.sqrt(n); i += 2){
            while (n % i == 0){
                largestFactor = i;
                n /= i;
            }
        }
        if(n > 2 ){
            largestFactor = n;
        }
        return largestFactor;
    }

}
