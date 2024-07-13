package org.projectEuler;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPolindrom = 0;
        for(int i = 999; i >= 100; i --){
            for (int j = i; j >= 100; j--){
                int result = i * j;
                if(checkPolindrom(result) && result > largestPolindrom) largestPolindrom = result;
            }
        }
        System.out.println(largestPolindrom);
    }
    public static boolean checkPolindrom(int num){
        int original = num;
        int revers = 0;
        while(num != 0){
            revers = (revers * 10) + (num % 10);
            num = num / 10;
        }
        return original == revers;
    }
}
