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
public class Test {
    
    public static void main(String[] args) {
        
        Test2 t2 = new Test2(10);
        System.out.println(t2.getVal());
        t2 = t2.incByTen();
        System.out.println(t2.getVal());
        Test2 t22 = t2.incByTen();
        System.out.println(t22.getVal());
        
        
    }
}
