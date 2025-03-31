/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tradingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class TradingApp {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Trading Crypto ===");
            System.out.println("1. Tambah Pengguna");
            System.out.println("2. Tampilkan Semua Pengguna");
            System.out.println("3. Tambah Aset Kripto ke Pengguna");
            System.out.println("4. Hapus Aset Kripto dari Pengguna");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    showUsers();
                    break;
                case 3:
                    addCryptoToUser();
                    break;
                case 4:
                    removeCryptoFromUser();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void addUser() {
    System.out.print("Masukkan username: ");
    String username = scanner.nextLine();
    
    int type = 0;
    boolean validInput = false;

    while (!validInput) {
        System.out.print("Pilih tipe pengguna (1 = Trader, 2 = Investor): ");
        if (scanner.hasNextInt()) {  // Pastikan input adalah angka
            type = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline
            if (type == 1 || type == 2) {
                validInput = true;
            } else {
                System.out.println("Pilihan tidak valid! Masukkan angka 1 atau 2.");
            }
        } else {
            System.out.println("Input harus berupa angka! Masukkan 1 atau 2.");
            scanner.nextLine(); // Kosongkan buffer jika input salah
        }
    }

    if (type == 1) {
        users.add(new Trader(username));
        System.out.println("Trader berhasil ditambahkan!");
    } else {
        users.add(new Investor(username));
        System.out.println("Investor berhasil ditambahkan!");
    }
}

    private static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("Tidak ada pengguna.");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

private static void addCryptoToUser() {
    System.out.print("Masukkan username: ");
    String username = scanner.nextLine();
    
    for (User user : users) {
        if (user.getUsername().equalsIgnoreCase(username)) {
            System.out.println("Pilih tipe aset yang ingin ditambahkan:");
            System.out.println("1. Token");
            System.out.println("2. NFT");
            System.out.print("Pilih: ");
            
            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 1) { // Token
                System.out.print("Masukkan nama token: ");
                String tokenName = scanner.nextLine();
                System.out.print("Masukkan harga token: ");
                double price = scanner.nextDouble();
                System.out.print("Masukkan total suplai token: ");
                double supply = scanner.nextDouble();
                scanner.nextLine();
                
                user.addAsset(new Token(tokenName, price, supply));
                System.out.println("Token berhasil ditambahkan!");

            } else if (type == 2) { // NFT
                System.out.print("Masukkan nama NFT: ");
                String nftName = scanner.nextLine();
                System.out.print("Masukkan harga NFT: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Masukkan Unique ID NFT: ");
                String uniqueID = scanner.nextLine();
                System.out.print("Masukkan deskripsi NFT: ");
                String description = scanner.nextLine();

                user.addAsset(new NFT(nftName, price, uniqueID, description));
                System.out.println("NFT berhasil ditambahkan!");
                
            } else {
                System.out.println("Pilihan tidak valid!");
            }
            return;
        }
    }
    System.out.println("Pengguna tidak ditemukan!");
}

    private static void removeCryptoFromUser() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                System.out.print("Masukkan nama aset yang akan dihapus: ");
                String assetName = scanner.nextLine();
                user.removeAsset(assetName);
                System.out.println("Aset berhasil dihapus!");
                return;
            }
        }
        System.out.println("Pengguna tidak ditemukan!");
    }
}