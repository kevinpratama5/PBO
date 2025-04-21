/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

public class NFT extends CryptoAsset {
    public NFT(String name, double price) {
        super(name, price);
    }

    @Override
    public String getAssetType() {
        return "NFT";
    }
}