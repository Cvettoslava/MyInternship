package com.company;

import java.time.Clock;


//Introducing Java
public class Main {

    public static void main(String[] args) {
        System.out.println("The greatest common divisor of the numbers is : "+GreatestCommonDivisor(48,56));
        System.out.println("At least a common multiple of two numbers is : "+NOK(14,21));
    }

    /** Exc. 1
     * Calculates the greatest common divisor of two numbers
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor of the specified numbers
     */
    public static int GreatestCommonDivisor (int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        else
        while(a!=b){
            if(a>b){
                a = a-b;
            }else if(b>a){
                b = b-a;
            }
        }
        return a;
    }

    /** Exc.2
     * Calculates at least a common multiple of two numbers
     * @param x the first number
     * @param y the second number
     * @return at least a common multiple of the specified numbers
     */
    public static int NOK(int x, int y){
        int NOD = GreatestCommonDivisor(x,y);
        int NOK = NOD*(x/NOD)*(y/NOD);
        return NOK;
    }
    
}
