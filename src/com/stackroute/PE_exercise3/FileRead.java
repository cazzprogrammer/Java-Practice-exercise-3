package com.stackroute.PE_exercise3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {

    public static void main(String[] args) {

        File file = new File("/home/cgi/Desktop/Text.txt");
        String str = "";

        try (BufferedReader br = new BufferedReader(new  FileReader(file))) {

            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                str = str + strCurrentLine;
                System.out.println(strCurrentLine);
            }
            System.out.println(str.toUpperCase());
            System.out.println("Length of the File : "+ file.length() + " bits");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
