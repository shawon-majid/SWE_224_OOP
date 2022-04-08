/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.strings;

/**
 *
 * @author shawonmajid
 */
public class StringComp {
    public static void main(String[] args) {
        String str1 = new String("abc"); // new keyword creates new memory location for an object
        String str2 = new String("abc");
        System.out.println(str1 == str2); // compares reference
        System.out.println(str1.equals(str2)); // compares contents
        
        String s1 = "abc";
        String s2 = "abc"; // here "abc" is the object and both s1 and s2 refers to this one 
        System.out.println(s1 == s2);
    }
}
