/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shawon.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author shawonmajid
 */
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("//Users//shawonmajid//Documents//simple.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader
        (new FileInputStream
        (f)));
 
        String content = "";
        String temp;
        while((temp=in.readLine())!=null){
            content += temp;
            System.out.println(temp);
        }
 
        in.close();
 
 
        content += " এইটা একটা পরিবর্তিত নথি .";
 
        BufferedWriter out = new BufferedWriter(
        new OutputStreamWriter
        (new FileOutputStream(
                f)));
 
 
        out.write(content);
 
        out.close();
    }
 
}
