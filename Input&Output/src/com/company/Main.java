package com.company;

import Exc1.ReadingClass;
import Exc2andExc3.OverwriteInTextFile;
import Exc4.TransferObject;
import Exc5.DataClass;
import Exc5.Person;
import Exc6.DirectoryBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //Exc 1
        /*ReadingClass obj = new ReadingClass();
        String resultString = obj.readString();
        int resultInt = obj.readInt();
        char resultChar = obj.readChar();
        float resultFloat = obj.readFloat();

        System.out.println(resultString);
        System.out.println(resultInt);
        System.out.println(resultChar);
        System.out.println(resultFloat);

        //Exc2 and 3
        OverwriteInTextFile object = new OverwriteInTextFile();
        object.WritingInFile();
        object.ReadingFile();*/

        //Exc 4
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\UserHP\\IdeaProjects\\Input&Output\\inputFile.txt");
            out = new FileOutputStream("C:\\Users\\UserHP\\IdeaProjects\\Input&Output\\outputFile.txt");

            TransferObject transferObject = new TransferObject();
            transferObject.transfer(in,out,2, 4);
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
/*
        //Exc. 5
        String filepath="C:\\Users\\UserHP\\IdeaProjects\\Input&Output\\src\\Exc5\\ObjInformation.txt";
        try {
            in = new FileInputStream(filepath);
            out = new FileOutputStream(filepath);
            DataClass dataClass = new DataClass();
            Person person = new Person("Iskren", 30, "6473694326");

            dataClass.saveObject(out,person);
            Object result = null;
            try {
                result = dataClass.getObject(in);
            } catch (ClassNotFoundException e) {
                System.out.println("The class not found");
                e.printStackTrace();
            }
            System.out.println(result);

        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        //Exc. 6
        DirectoryBrowser directoryBrowser = new DirectoryBrowser();
        directoryBrowser.listContent("nishto.txt");*/
    }
}
