package com.stackroute.PE_exercise3;
import java.util.Scanner;
public class StudentMarks {

    public void getMarks()
    {
        int numOfStudent ;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number of Student");
        numOfStudent = sc.nextInt();
        int arr[] = new int[numOfStudent];
        System.out.println("Enter the grades of the Student");
        int grades;
        try {

            for(int i=0;i<numOfStudent;i++)
            {
                grades = sc.nextInt();
                if(grades>=0 && grades <= 100)
                {
                    arr[i]=grades;
                }
                else
                {
                    throw new Exception("Invalid grade: The grade should be within the range 0 to 100");
                }
            }
            System.out.println("Successful saved");
        }
        catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
        }


    }
}
