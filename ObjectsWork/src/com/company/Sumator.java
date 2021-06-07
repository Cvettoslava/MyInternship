package com.company;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {

    /** Exc. 1
     * Calculates the sum of two Integers.
     * @param a is the first Integer.
     * @param b is the second Integer.
     * @return the sum of the specified Integers.*/
    Integer sum(Integer a, Integer b){
        int sum = a+b;
        return sum;
    }

    /** Calculates the sum of two Doubles
     * @param a the first number Double.
     * @param b the second number Double.
     * @return the sum of the specified Doubles*/
    Double sum (Double a, Double b){
        double sum = a+b;
        return sum;
    }

    /** Calculates the sum of two Strings.
     * @param a the first number String.
     * @param b the second number String.
     * @return the sum of the specified Strings*/
    String sum (String a, String b){
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int sum = a1+b1;
        String sum1 = String.valueOf(sum);
        return sum1;
    }

    /** Calculates the sum of two BigIntegers.
     * @param a the first BigInteger.
     * @param b the second BigInteger.
     * @return the sum of the specified BigIntegers.*/
    BigInteger sum (BigInteger a, BigInteger b){
        BigInteger sum;
        sum = a.add(b);
        return sum;
    }

    /** Calculates the sum of two BigDecimals.
     * @param a the first BigDecimal.
     * @param b the second BigDecimal.
     * @return the sum of the specified BigDecimals.*/
    BigDecimal sum (BigDecimal a, BigDecimal b){
        BigDecimal sum;
        sum = a.add(b);
        return sum;
    }
}
