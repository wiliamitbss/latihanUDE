/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1;

/**
 *
 * @author User
 */
public class Latihan1 {

    public static void main(String[] args) {
        // Contoh penggunaan
        try {
            // Membuat objek Barang
            Barang barang1 = new Barang("001", "Beras", "Gudang A", 5000, 6000);

            // Mencoba melakukan pembelian dengan harga jual <= 0
            barang1.beliBarang(1);  // Ini akan menghasilkan InvalidPriceException

        } catch (InvalidPriceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}