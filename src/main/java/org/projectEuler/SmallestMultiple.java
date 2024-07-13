package org.projectEuler;

public class SmallestMultiple {
    public static void main(String[] args) {
        int smallestMultiple = 1;
        while(true){
            if(checkMultiple(smallestMultiple)){
                System.out.println(smallestMultiple);
                break;
            }
            smallestMultiple++;
        }
    }
    public static boolean checkMultiple(int number){
        for(int i = 1; i <= 20; i++){
            if(number % i != 0){
                return false;
            }
        }
        return true;
    }
}
