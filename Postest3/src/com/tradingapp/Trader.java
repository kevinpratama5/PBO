/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Trader extends User {
    private int tradeCount; // Jumlah transaksi yang dilakukan

    public Trader(String username) {
        super(username);
        this.tradeCount = 0;
    }

    public int getTradeCount() {
        return tradeCount;
    }

    public void incrementTradeCount() {
        this.tradeCount++;
    }

    @Override
    public String toString() {
        return "Trader{" + "username='" + getUsername() + '\'' + ", tradeCount=" + tradeCount + ", portfolio=" + portfolio + '}';
    }
}