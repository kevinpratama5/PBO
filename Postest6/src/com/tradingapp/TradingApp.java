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

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

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
        System.out.print("Pilih tipe pengguna (1 = Trader, 2 = Investor): ");

        int type = 0;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input harus angka!");
            return;
        }

        if (type == 1) {
            users.add(new Trader(username));
            System.out.println("Trader berhasil ditambahkan!");
        } else if (type == 2) {
            users.add(new Investor(username));
            System.out.println("Investor berhasil ditambahkan!");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("Belum ada pengguna.");
            return;
        }
        for (User user : users) {
            user.displayPortfolio();
        }
    }

    private static void addCryptoToUser() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        User foundUser = findUser(username);
        if (foundUser == null) {
            System.out.println("Pengguna tidak ditemukan!");
            return;
        }

        System.out.print("Pilih jenis aset (1 = Token, 2 = NFT): ");
        int type = 0;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input harus angka!");
            return;
        }

        System.out.print("Masukkan nama aset: ");
        String assetName = scanner.nextLine();
        System.out.print("Masukkan harga aset: ");
        double price = 0;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Harga harus angka!");
            return;
        }

        if (type == 1) {
            foundUser.addAsset(new Token(assetName, price));
        } else if (type == 2) {
            foundUser.addAsset(new NFT(assetName, price));
        } else {
            System.out.println("Pilihan jenis aset tidak valid!");
        }

        System.out.println("Aset berhasil ditambahkan ke portofolio " + username + "!");
    }

    private static void removeCryptoFromUser() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        User foundUser = findUser(username);
        if (foundUser == null) {
            System.out.println("Pengguna tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan nama aset yang akan dihapus: ");
        String assetName = scanner.nextLine();
        foundUser.removeAsset(assetName);
        System.out.println("Aset berhasil dihapus dari portofolio " + username + "!");
    }

    private static User findUser(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }
}
