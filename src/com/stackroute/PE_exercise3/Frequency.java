package com.stackroute.PE_exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Frequency {

    public static void main(String args[])
    {
        File file = new File("/home/cgi/Desktop/DemoText.txt");
        String str = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                str = str + strCurrentLine;
                System.out.println(strCurrentLine);
            }
            str = str.replace(",","");
            str = str.replace(".","");
            System.out.println(str);
            String[] words = str.split(" ");
            System.out.println(Arrays.toString(words));
            System.out.println(words.length);
            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> list1 = new ArrayList<>();
            String word = "";
            for(int i=0;i<words.length;i++)
            {
                if(!list.contains(words[i]))
                {
                    list1.add(words[i]);

                }
                list.add(words[i]);
            }

            for(int i = 0;i< list1.size();i++)
            {
                System.out.println("The Frequency of "+ list1.get(i)+" "+ Collections.frequency(list,list1.get(i)));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
