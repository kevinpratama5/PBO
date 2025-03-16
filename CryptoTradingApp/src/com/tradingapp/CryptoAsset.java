/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class CryptoAsset {
    String name;
    double price;

    public CryptoAsset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CryptoAsset{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}

