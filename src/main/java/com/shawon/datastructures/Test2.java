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
public class Test2 {
    private int a;
    Test2(int a){
        this.a = a;
    }
    
    Test2 incByTen(){
        Test2 t2 = new Test2(a+10);
        return t2;
    }
    
    int getVal(){
        return a;
    }
    
}
