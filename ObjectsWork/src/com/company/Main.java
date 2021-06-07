package com.company;

import Cars.Mercedes;
import Cars.Opel;
import Cars.VW;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        //Exc. 1
        Sumator sumator = new Sumator();
        System.out.println("The sum of the Integers is: "+sumator.sum(5,9));
        System.out.println("The sum of the Doubles is: "+sumator.sum(7.9,3.4));
        System.out.println("The sum of the Strings is: "+sumator.sum("47456","86865"));
        System.out.println("The sum of the BigIntegers is: "
                +sumator.sum(new BigInteger("236465767985765"), new BigInteger("6465873464345362")));
        System.out.println("The sum of the BigDecimals is: "
                +sumator.sum(new BigDecimal("23646576.7985765"), new BigDecimal("646587346.434536237")));

        //Exc.2
        //VW vw = new VW();
        Mercedes mercedes = new Mercedes();
        Opel opel = new Opel(2000,4);

        String soundingMercedes = mercedes.Sounding();
        System.out.println(soundingMercedes);
        String soundingOpel = opel.Sounding();
        System.out.println(soundingOpel);

        int opelWeight = opel.getCarWeight();
        System.out.println(opelWeight);

    }
}
