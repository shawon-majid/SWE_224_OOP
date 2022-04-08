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
public class Main {
    
    // main method represents main thread
    public static void main(String[] args) {
        // whatever we write in here will be executed by main thread
        // threads always executes the jobs in a sequence
        
        
        // job1
        System.out.println("===Application Started===");
        
        // job2
        MyTask task = new MyTask();
        //task.executeTask();
       
                       
        task.start();
        
        
        // another way is using runnable 
        Runnable r = new MyTask2();
        Thread task2 = new Thread(r);
        task2.start();
        
        // till job2 is not finished the below written jobs are blocked
        
        
        // now main and MyTask are executing both concurrently 
        
        // job3
        for(int doc = 1; doc <= 10; doc++){
            System.out.println("^^ printing document #"+doc+ " - printer1");
        }
        
        // job4
        System.out.println("===Application Finished===");
        
    }
}
