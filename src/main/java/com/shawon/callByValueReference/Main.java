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

// understanding the use of memory models of objects
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red");
        Car car2 = new Car("Black");
        
        System.out.println("Car1 Color : " + car1.getColor());
        System.out.println("Car2 Color : " + car2.getColor());
        
        swap(car1, car2);
        
        System.out.println("Car1 Color : " + car1.getColor());
        System.out.println("Car2 Color : " + car2.getColor());
        
        car1.swap(car2);
        
        System.out.println("Car1 Color : " + car1.getColor());
        System.out.println("Car2 Color : " + car2.getColor());
        
    }
    
    public static void swap(Car c1, Car c2){
        Car temp;
        temp = c1;
        c1 = c2;
        c2 = temp;
        //c2.setColor("Red");
        //c1.setColor("Black");
    }
}
