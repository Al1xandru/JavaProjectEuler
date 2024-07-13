package org.projectEuler;

public class SumSquareDifference {
    public static void main(String[] args) {
        long resultOne = 0;
        long resultTwo = 0;
        for(int i = 1; i <= 100; i++){
            resultOne += i * i;
            resultTwo += i;
        }
        System.out.println((resultTwo * resultTwo) - resultOne);
    }
}
