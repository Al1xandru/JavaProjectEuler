package org.projectEuler;

public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 0; i < 1000000; i++){
            String binary = Integer.toBinaryString(i);
            if(!"0".equals(binary.charAt(binary.length()-1))){
                if(checkPolindrom(i) && checkPolindrom(binary)){
                    result += i;
                }
            }
        }
        System.out.println(result);
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
    public static boolean checkPolindrom(String s){
        String reversS = new StringBuilder(s).reverse().toString();
        return reversS.equals(s);
    }
}
