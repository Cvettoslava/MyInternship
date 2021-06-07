package com.company;

import Exc1.PageBean;
import Exc2.WordProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exc. 1
        PageBean pageBean = new PageBean();
        ArrayList<String> list = new ArrayList<String>();

        list.add("Geeks");
        list.add("Practice");
        list.add("Contribute");
        list.add("IDE");
        list.add("Courses");
        list.add("Numbers");
        list.add("Strings");
        list.add("Arrays");
        System.out.println("Ima li list: "+list);
        pageBean.next(list,4);

        //Exc. 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        String s = "this is a this is this a hhhhhhhh hhhhhh hhhhh";
        WordProcessing wp = new WordProcessing();
        wp.FindingWordFrequency(text);
        List<Character> result = wp.maximumOccurringChars(s, true);
        System.out.println("'"+result+"'");
    }
}
