package com.stackroute.PE_exercise3;
import java.util.Scanner;
public class Matrix {

    public void addMatrix()
    {
        Scanner sc =  new Scanner(System.in);
        int row, col;
        System.out.println("Enter the row and column of the matrix");
        row = sc.nextInt();
        col = sc.nextInt();

        int A[][] = new int[row][col];
        int B[][] = new int[row][col];

        System.out.println("Enter the values in the first matrix");

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values in the Second matrix");

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                B[i][j] = sc.nextInt();
            }
        }


        int C[][] = new int[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("The Final Matrix After adding");

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
