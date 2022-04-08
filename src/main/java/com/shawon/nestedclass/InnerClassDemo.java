/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.nestedclass;

import com.shawon.nestedclass.Outer.Inner;

/**
 *
 * @author shawonmajid
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        // Inner inner = new Inner(); We cannot do that
        outer.showY(); // shows inner y
        outer.test2();
    }
}
