/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.multithreading;

/**
 *
 * @author shawonmajid
 */


public class SyncApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=====Application Started=====");
        
        Printer printer = new Printer();
        
        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);
        
        //Asyncronized if join is not used 
        mRef.start();
        
        // use join for syncronization
        //mRef.join();
        
        // alternatively we can mark our method as syncronized without using join
        
        yRef.start();
        
        System.out.println("=====Application Ended======");
    }
            
}
