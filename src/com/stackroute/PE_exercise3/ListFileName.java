package com.stackroute.PE_exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.Scanner;

public class ListFileName {

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s = "/home/cgi/Desktop/training/java/Exercise_1";
        File folder = new File("/home/cgi/Desktop/training/java/Exercise_1");
        File[] files = folder.listFiles();
        System.out.println("List of Files");
        for (File file : files)
        {
            if (file.isFile())
            {
                if(file.getName().endsWith(".java"))
                System.out.println(file.getName());
            }
        }
        System.out.println("Enter the file Name: ");
        String m = sc.next().trim();
        s=s+"/"+m;
        File file1 = new File(s);
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[(int) file1.length()];
        try
        {
            //convert file into array of bytes
            fileInputStream = new FileInputStream(file1);
            fileInputStream.read(bFile);
            fileInputStream.close();
            for (int i = 0; i < bFile.length; i++)
            {
                System.out.print((char) bFile[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
