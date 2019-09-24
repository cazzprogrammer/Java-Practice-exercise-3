package com.stackroute.PE_exercise3;

public class ChessBoard {

    public void display()
    {
        int flag=0;

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(flag==0) {
                    System.out.print("WW|");
                    flag =1;
                }
                else {
                    System.out.print("BB|");
                    flag =0;
                }
            }
            System.out.println();
        }
    }

}
