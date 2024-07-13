package org.projectEuler;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int a = 1, b = 2, result = 0;
        while( b <= 4000000){
            if( b % 2 == 0)result += b;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(result);
    }
}


