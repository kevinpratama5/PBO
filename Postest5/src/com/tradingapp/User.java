/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

import java.util.ArrayList;

public abstract class User {
    private String username;
    private ArrayList<CryptoAsset> portfolio;

    public User(String username) {
        this.username = username;
        this.portfolio = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<CryptoAsset> getPortfolio() {
        return portfolio;
    }

    public void addAsset(CryptoAsset asset) {
        portfolio.add(asset);
    }

    public void addAsset(String name, double price) {
        portfolio.add(new Token(name, price)); // Overloaded method
    }

    public void removeAsset(String assetName) {
        portfolio.removeIf(asset -> asset.getName().equalsIgnoreCase(assetName));
    }

    public abstract String getUserType();

    @Override
    public String toString() {
        return getUserType() + "{" +
                "username='" + username + '\'' +
                ", portfolio=" + portfolio +
                '}';
    }
}