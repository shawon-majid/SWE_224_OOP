/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.datastructures;

/**
 *
 * @author shawonmajid
 */
public class VariableLengthArgs {
    
    static void vaTest(int ... a){
        for(int x: a){
            System.out.println(x);
        }
    }
    
    static void vaTest(boolean ... a){
        for(boolean x: a){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        vaTest(1, 2, 2);
        vaTest(true, true, false); // ok till now
        // vaTest(); it becomes ambigous 
    }
}
