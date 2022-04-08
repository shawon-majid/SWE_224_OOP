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
public class MyThread extends Thread{
    
    Printer pRef;
    MyThread(Printer p){
        pRef = p;
    }
    
    @Override
    public void run(){
        pRef.printDocuments(10, "shawon's file.pdf");
    }
}
