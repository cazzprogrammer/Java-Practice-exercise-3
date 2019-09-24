package com.stackroute.PE_exercise3;

public class TryCatch {

    public static  void main(String args[])
    {
        try{
            int n[] = new int[-19];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("NegativeArraySizeException");
        }
        try{
            int k[] = {1,3,2};
            System.out.println(k[3]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            String s = null;
            boolean r = s.equals("gff");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
}
