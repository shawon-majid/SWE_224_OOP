/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.exceptionhandling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shawonmajid
 */
public class CustomExpTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        try {
            validate(age);
        } catch (AgeException ex) {
            System.out.println("Caught The invalid Age Exception");
        }
    }
    
    static void validate(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("This is invalid age");
        }
        else{
            System.out.println("Welcome to Vote!");
        }
    }
    
}
