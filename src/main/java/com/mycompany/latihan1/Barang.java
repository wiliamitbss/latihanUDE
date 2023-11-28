/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author User
 */
public class Barang {
    private String kode;
    private String nama;
    private String gudang;
    private double hargaBeli;
    private double hargaJual;

    public Barang(String kode, String nama, String gudang, double hargaBeli, double hargaJual) {
        this.kode = kode;
        this.nama = nama;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }
    
    public void beliBarang(int jumlah) throws HargaException, KuantitasException {
        if (hargaJual <= 0 || jumlah < 1) {
            throw new HargaException("Harga jual barang tidak valid");
        }

        // Proses pembelian barang
        System.out.println(jumlah + " " + nama + " telah dibeli.");
    }
}

