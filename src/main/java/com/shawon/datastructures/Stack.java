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
public class Stack {
    // This class defines an integer stack that can hold initialized number of values

    private int stck[];
    private int tos;
    // Initialize top-of-stack
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Push an item onto the stack
    void push(int item) {
        if(tos==stck.length-1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    // Pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
        return stck[tos--];
    }

}
