package Exc1;

import java.util.Scanner;

public class ReadingClass {
    Scanner scanner = new Scanner(System.in);

    /** Reads input string from a keyboard.
     * @return the read string from a keyboard*/
    public String readString(){
        String inputChoice;
        System.out.println("Enter a string by your choice:");
        inputChoice = scanner.nextLine();
        return inputChoice;
    }

    /** Reads input number from a keyboard.
     * @return the read number from a keyboard*/
    public int readInt(){
        int inputChoice;
        System.out.println("Enter a number by your choice:");
        inputChoice = scanner.nextInt();
        return inputChoice;
    }

    /** Reads input character from a keyboard.
     * @return the read character from a keyboard*/
    public char readChar(){
        char inputChoice;
        System.out.println("Enter a character by your choice:");
        inputChoice = scanner.next().charAt(0);
        return inputChoice;
    }

    /** Reads input float number from a keyboard.
     * @return the read float number from a keyboard*/
    public float readFloat(){
        float inputChoice;
        System.out.println("Enter a float number by your choice:");
        inputChoice = scanner.nextFloat();
        return inputChoice;
    }
}
