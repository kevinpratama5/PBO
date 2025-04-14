/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Investor extends User {
    public Investor(String username) {
        super(username);
    }

    @Override
    public String getUserType() {
        return "Investor";
    }
}