package com.stackroute.PE_exercise3;

public class MainExceptionThrow extends Exception {

        public MainExceptionThrow(String message)
        {
            super(message);
        }
        public static void main(String args[])
        {
            try{
                throw new MainExceptionThrow("Error re babaa");
            }
            catch(MainExceptionThrow e){

                System.out.println("Message : "+e.getMessage());
            }
            finally {
                System.out.println("In Finally block");
            }
    }
}
