/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.callByValueReference;

/**
 *
 * @author shawonmajid
 */
public class Car {
    private String color;
    public Car(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void swap(Car c){
        String tempColor = this.getColor();
        this.color = c.getColor();
        c.setColor(tempColor);
    }
}
