/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

import java.util.ArrayList;

public class User {
    String username;
    ArrayList<CryptoAsset> portfolio;

    public User(String username) {
        this.username = username;
        this.portfolio = new ArrayList<>();
    }

    public void addAsset(CryptoAsset asset) {
        portfolio.add(asset);
    }

    public void removeAsset(String assetName) {
        portfolio.removeIf(asset -> asset.name.equalsIgnoreCase(assetName));
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", portfolio=" + portfolio + '}';
    }
}
