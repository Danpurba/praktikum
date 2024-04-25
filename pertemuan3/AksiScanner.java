/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.util.scanner;
public class AksiScanner {
    public static void main(String[] args) {
        ClassScanner scan = new ClassScanner();
        
        scan.inputScanner();
        System.out.println("Nama Anda: " + scan.getnama());
        System.out.println("Nilai Anda: " + scan.rata());
    }
}