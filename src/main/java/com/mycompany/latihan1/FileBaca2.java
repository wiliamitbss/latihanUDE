/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

import java.io.FileReader;
import java.io.IOException;

public class FileBaca2 {
    public static void bacaFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            // Tangani IOException (file tidak ditemukan atau masalah IO lainnya)
            System.err.println("IOException: " + e.getMessage());
        } catch (Exception e) {
            // Tangani exception umum (selain IOException)
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
