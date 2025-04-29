/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Trader extends User {
    public Trader(String username) {
        super(username);
    }

    @Override
    public void displayPortfolio() {
        System.out.println("=== Portofolio Trader " + getUsername() + " ===");
        super.displayPortfolio();
    }
}
