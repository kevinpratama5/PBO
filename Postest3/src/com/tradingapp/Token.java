/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Token extends CryptoAsset {
    private double totalSupply;

    public Token(String name, double price, double totalSupply) {
        super(name, price); // Memanggil constructor dari CryptoAsset
        this.totalSupply = totalSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    @Override
    public String toString() {
        return "Token{" + "name='" + getName() + "', price=" + getPrice() + ", totalSupply=" + totalSupply + '}';
    }
}