package Exc2andExc3;

import java.io.*;
import java.util.Scanner;

public class OverwriteInTextFile {
    Scanner scanner = new Scanner(System.in);
    File file = new File("C:\\Users\\UserHP\\IdeaProjects\\Input&Output\\testText.txt");
    BufferedWriter buffWriter = null;
    FileWriter fileWriter = null;
    Reader reader = null;

    /** Reads input text from a keyboard.
     * @return the read string from a keyboard*/
    public String readText() {
        String input;
        System.out.println("Enter a text by your choice:");
        input = scanner.nextLine();

        return input;
    }

    /** Writes the read text from a keyboard in a file.*/
    public void WritingInFile() {

        try {
            String textToBeWritten = readText();

            fileWriter = new FileWriter(file.getAbsoluteFile());
            buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(textToBeWritten);
            buffWriter.flush();
            System.out.println("Ready!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffWriter != null) {
                try {
                    buffWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    /** Reads some text from file.*/
    public void ReadingFile(){
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader buffReader =
                     new BufferedReader(reader)) {
            String line = buffReader.readLine();
            System.out.println("Read line is: "+line);
            if(line != null) {
                StringBuffer sb1 = new StringBuffer(line);
                String reversed = sb1.reverse().toString();
                System.out.println("Reversed string line is : "+reversed);

                fileWriter = new FileWriter(file.getAbsoluteFile());
                buffWriter = new BufferedWriter(fileWriter);
                buffWriter.write(reversed);
                System.out.println("The reversed string is saved in the file!");
                buffWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}