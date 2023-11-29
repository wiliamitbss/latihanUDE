/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

import java.io.File;
import java.io.FileNotFoundException;

public class FileBaca{
    public static String FileBaca(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        return "";
    }
}
