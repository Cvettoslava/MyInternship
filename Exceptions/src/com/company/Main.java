package com.company;

import Exc3andExc4.EmptyList;
import Exc3andExc4.WorkWithList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exc. 1 and 2
       try{
            System.out.println("The sum of the Strings is: "+ sum("655565945635697438555555554","70766666668678698"));
        }catch(NumberFormatException e) {
            System.out.println("Incorrect format, please enter only numbers(Integers)"+
            " or maybe the input is too long and it is not an Integer type of value.!");
        }catch (Exception e) {
            e.printStackTrace();
        }
        try {
            readingFromKeyboard();
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        // Exc. 3 and 4
        ArrayList al = new ArrayList();
        WorkWithList workWithList = new WorkWithList(al);
        workWithList.add("First element");
        workWithList.add(" Second element ");
        workWithList.add("Third element");
        workWithList.add( "element 0");
        try {
            workWithList.remove();
        } catch (EmptyList emptyList) {
            System.out.println(emptyList.getMessage());
        }
        workWithList.printAllElements();
    }

    //Exc. 1 and 2
    /** Calculates the sum of two Strings.
     * @param a the first number String.
     * @param b the second number String.
     * @return the sum of the specified Strings*/
    static String sum (String a, String b) {
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int sum = a1 + b1;
        String sum1 = String.valueOf(sum);
        return sum1;
    }

    //Exc. 1 and 2
    /** Reads numbers from a keyboard.*/
    public static void readingFromKeyboard () throws OutOfRangeException {
        int number1,number2;
        System.out.println("\nEnter number in interval [0-100]:");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        if (number1<0 || number1>100){
            throw new OutOfRangeException();
        }else{
            System.out.println("Enter number in interval [10-20]:");
            number2 = scanner.nextInt();
            if (number2<10 || number2>20){
                throw new OutOfRangeException();
            }else{
                System.out.println("Everything is fine! Thank you!");
            }
        }
    }
}
