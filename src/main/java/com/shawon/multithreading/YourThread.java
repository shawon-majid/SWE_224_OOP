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
public class YourThread extends Thread{

    Printer pRef;
    YourThread(Printer p){
        pRef = p;
    }
    
    @Override
    public void run() {
        pRef.printDocuments(10, "Mujammals doc.pdf");
    }
       
}
