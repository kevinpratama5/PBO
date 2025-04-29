package com.tradingapp;

public abstract class CryptoAsset {
    private final String name;
    private double price;

    public CryptoAsset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
