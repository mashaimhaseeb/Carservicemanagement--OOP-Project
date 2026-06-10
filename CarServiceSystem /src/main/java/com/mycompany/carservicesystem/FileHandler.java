/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carservicesystem;

/**
 *
 * @author mashaimhaseeb
 */
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.*;

public class FileHandler {

    public static void save(String data) {
        try {
            FileWriter fw = new FileWriter("services.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void read(javax.swing.table.DefaultTableModel model) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("services.txt"));
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

    

