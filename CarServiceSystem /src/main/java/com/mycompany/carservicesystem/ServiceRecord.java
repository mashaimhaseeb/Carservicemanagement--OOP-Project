/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carservicesystem;

/**
 *
 * @author mashaimhaseeb
 */

public class ServiceRecord {
    private Customer customer;
    private Car car;
    private String service;
    private double cost;

    public ServiceRecord(Customer c, Car car, String service, double cost) {
        this.customer = c;
        this.car = car;
        this.service = service;
        this.cost = cost;
    }

    public String toString() {
        return customer.getName() + "," +
               customer.getPhone() + "," +
               car.getModel() + "," +
               car.getPlate() + "," +
               service + "," +
               cost;
    }
}

    

