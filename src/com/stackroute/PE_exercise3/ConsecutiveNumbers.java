package com.stackroute.PE_exercise3;

import java.util.Scanner;
public class ConsecutiveNumbers {

    public void checkConsective()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter 7 numbers separated by comma");
        String s = sc.nextLine();
        int flag =0;
        String str[] = s.split(",");
        if(str.length == 7) {
            for (int i = 0; i < 5; i++) {
                if (Integer.parseInt(str[i]) - Integer.parseInt(str[i + 1]) == Integer.parseInt(str[i + 1]) - Integer.parseInt(str[i + 2])) {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(s + " non Consecutive number");
            else
                System.out.println(s + " Consecutive number");
        }
        else{
            System.out.println("Saath Number dalne bola tha bdsk");
        }
    }
}
