/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

import java.util.ArrayList;

public class User implements AssetManagement {
    private String username;
    protected ArrayList<CryptoAsset> portfolio = new ArrayList<>();

    public User(String username) {
        this.username = username;
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

    @Override
    public void addAsset(CryptoAsset asset) {
        portfolio.add(asset);
    }

    @Override
    public void removeAsset(String assetName) {
        portfolio.removeIf(asset -> asset.getName().equalsIgnoreCase(assetName));
    }

    public void displayPortfolio() {
        if (portfolio.isEmpty()) {
            System.out.println(username + " belum memiliki aset.");
        } else {
            System.out.println("Portofolio " + username + ":");
            for (CryptoAsset asset : portfolio) {
                asset.displayInfo();
            }
        }
    }
}
