/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class NFT extends CryptoAsset {
    private String uniqueID;
    private String description;

    public NFT(String name, double price, String uniqueID, String description) {
        super(name, price); // Memanggil constructor dari CryptoAsset
        this.uniqueID = uniqueID;
        this.description = description;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NFT{" + "name='" + getName() + "', price=" + getPrice() + 
               ", uniqueID='" + uniqueID + "', description='" + description + "'}";
    }
}