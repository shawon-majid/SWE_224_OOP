/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shawonmajid
 */
public class Printer {
    synchronized public void printDocuments(int numberOfCopies, String docName){
        for(int i = 1; i <= numberOfCopies; i++){
            try {
                Thread.sleep(500); // will slow down the thread by 500 miliseconds
            } catch (InterruptedException ex) {
                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(">> printing " + docName + " " + i);
        }
    }
}
