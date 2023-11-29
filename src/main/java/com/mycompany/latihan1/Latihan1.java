/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        try {
            // Latihan 1
            Barang barang1 = new Barang("001", "Beras", "Gudang A", 5000, 6000);
            barang1.beliBarang(-1);  

        } catch (HargaException | KuantitasException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        //Latihan 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama file: ");
        String fileName = scanner.nextLine();

        try {
            String data = FileBaca.FileBaca(fileName);
            System.out.println("File ditemukan.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Latihan 3
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Masukkan nama file: ");
        String fileName1 = scanner1.nextLine();

        try {
            String data1 = FileBaca.FileBaca(fileName1);
            System.out.println("File ditemukan.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        } finally {
            scanner1.close();
        }
   
    }
}