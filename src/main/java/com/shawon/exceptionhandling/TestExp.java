/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author shawonmajid
 */
public class TestExp {
    public static void main(String[] args) {
        try{
            System.out.println("Enter a number");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            double number = Double.parseDouble(input);
            System.out.println("The number is " + number);
        }
        catch(Exception e){ // one try block can have multiple catch block
            System.out.println("You did not enter a number!");
        }
 
        finally{
            System.out.println("This block will always run whether or not the exception is caught");
        }
        
        System.out.println("What happens after catching/not catching the exception!");
        
        
    }
}
