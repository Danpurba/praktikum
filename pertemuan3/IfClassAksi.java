/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class IfClassAksi {
    public static void main(String[] args)
    {
        double totBeli;
        Scanner input = new Scanner(System.in);
        IfClass fungsiif = new IfClass();
        
        System.out.print("Total Pembelian: ");
        fungsiif.totBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan: Rp. " + fungsiif.getPotongan());
        System.out.println("Jumlah yang Harus Dibayarkan: " + fungsiif.jumlahBayar());
    }
}