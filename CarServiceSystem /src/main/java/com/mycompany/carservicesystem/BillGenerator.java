/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carservicesystem;

/**
 *
 * @author mashaimhaseeb
 */

public class BillGenerator {

    public static String generate(String name, String car, String service, double cost) {
        return "===== SERVICE BILL =====\n"
             + "Customer: " + name + "\n"
             + "Car: " + car + "\n"
             + "Service: " + service + "\n"
             + "Total: " + cost + "\n"
             + "=======================";
    }
}

    

