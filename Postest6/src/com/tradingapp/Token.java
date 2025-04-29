/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class Token extends CryptoAsset {
    public Token(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Token: " + getName() + " dengan harga $" + getPrice());
    }
}
