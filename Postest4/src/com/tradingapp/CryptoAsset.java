package com.tradingapp;

public class CryptoAsset {
    private String name;
    private double price;

    public CryptoAsset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAssetType() {
        return "Generic CryptoAsset";
    }

    @Override
    public String toString() {
        return getAssetType() + " {name='" + name + "', price=" + price + "}";
    }
}