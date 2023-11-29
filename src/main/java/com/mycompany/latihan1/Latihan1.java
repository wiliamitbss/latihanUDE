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
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masukkan nama file: ");
//        String fileName = scanner.nextLine();
//
//        try {
//            String data = FileBaca.FileBaca(fileName);
//            System.out.println("File ditemukan.");
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
        
        //Latihan 3
//        String fileName = "C:\\Users\\ASUS\\Documents\\tugas.txtd";
//        bacaFile(fileName);
//        if (fileName == null) {
//            System.out.println("Isi file ditemukan");
//        } else {
//            System.out.println("File tidak ditemukan atau terjadi kesalahan.");
//        }
   
    }
}