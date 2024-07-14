package org.projectEuler;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        boolean check = true;
        for(int c = 0; check; c++){
            for(int b = 0; b < c; b++){
                for (int a = 0; a < b; a++){
                    if(a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                        System.out.println(a*b*c);
                        check = false;
                    }
                }
            }
        }
    }
}
