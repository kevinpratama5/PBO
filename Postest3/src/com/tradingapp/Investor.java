/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Investor extends User {
    private double totalInvestment; // Total investasi dalam aset kripto

    public Investor(String username) {
        super(username);
        this.totalInvestment = 0;
    }

    public double getTotalInvestment() {
        return totalInvestment;
    }

    public void addInvestment(double amount) {
        this.totalInvestment += amount;
    }

    @Override
    public String toString() {
        return "Investor{" + "username='" + getUsername() + '\'' + ", totalInvestment=" + totalInvestment + ", portfolio=" + portfolio + '}';
    }
}