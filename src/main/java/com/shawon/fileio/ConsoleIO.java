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
import java.util.Scanner;

/**
 *
 * @author shawonmajid
 */
public class ConsoleIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("//Users//shawonmajid//Documents//simple.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String content = "";
        String temp;
        while( (temp = br.readLine()) != null ){
            content += temp;
        }
        System.out.println("content of currentFile : " + content);
        
        System.out.println("Add some content here : ");
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        
        Scanner sc = new Scanner(System.in);
        
        temp = sc.nextLine();
        
        bw.write(content + temp);
        
        br.close();
        bw.close();
        
    }
}
