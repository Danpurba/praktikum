/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author USER
 */
public class IfClass {
    public double totBeli, potongan;
    
    public void setTotalBeli(double a) {
        totBeli = a;
    }
    
    public double getPotongan() {
        if(totBeli >= 50000) {
            potongan = 0.2 * totBeli;
        }
        return potongan;
    }
    
    public double jumlahBayar() {
        return (totBeli - potongan);
    }
}