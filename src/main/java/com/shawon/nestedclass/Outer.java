/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.nestedclass;

/**
 *
 * @author shawonmajid
 */
public class Outer { // it can access the inner class through object but not directly
    int outerX = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    public class Inner{ // it can access the outer class directly
        int y = 10;
        void display(){
            System.out.println("The outerX is : " + outerX);
        }
    }
    
    public void showY(){
        // System.out.println("Y : " + y); y is not known in outer class
        // but we can access it through inner class
        Inner inner = new Inner();
        System.out.println("Y : " + inner.y);
    }
    
    // we can define inner class inside any block of code (i.e. function / for loop)
    void test2(){
        for(int i = 0; i < 10; i++){
            class Inner2{ // we cannot write public ---> i don't know why
                void display(){
                    System.out.println("Outer X: " + outerX);
                }
            }   
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}
