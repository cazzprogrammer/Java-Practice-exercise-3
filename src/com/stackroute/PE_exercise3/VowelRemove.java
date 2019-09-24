package com.stackroute.PE_exercise3;
import java.util.Scanner;
public class VowelRemove {

    public void removeSmallVowel()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        sc.nextLine();

        String str[] = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }

        for(int i=0;i<n;i++)
        {
            String s = "";
            for(int j=0;j<str[i].length();j++)
            {

                if(str[i].charAt(j) == 'a'  || str[i].charAt(j) =='e' || str[i].charAt(j) =='i' || str[i].charAt(j) =='o' || str[i].charAt(j) =='u')
                {
                    continue;
                }
                else
                {
                    s = s+str[i].charAt(j);
                }
            }
            System.out.println("Place name without vowel: "+ i+" "+ s);
        }
    }
}
