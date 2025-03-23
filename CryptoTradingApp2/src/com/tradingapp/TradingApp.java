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
        users.add(new User(username));
        System.out.println("Pengguna berhasil ditambahkan!");
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
                System.out.print("Masukkan nama aset: ");
                String assetName = scanner.nextLine();
                System.out.print("Masukkan harga aset: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                user.addAsset(new CryptoAsset(assetName, price));
                System.out.println("Aset berhasil ditambahkan!");
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