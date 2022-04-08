/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.threads;

/**
 *
 * @author shawonmajid
 */

// MyTask is-a Thread
public class MyTask extends Thread{
    @Override
    public void run(){
        for(int doc = 1; doc <= 10; doc++){
            System.out.println("@@ printing document #"+doc+ " - printer2");
        }
    }
    
}
