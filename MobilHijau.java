/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author WINDOWS 10
 */
public class MobilHijau {
    public static void main(String[] args) {
        mobil MobilHijau = new mobil();
        
        MobilHijau.merkMobil = "Toyota";
        MobilHijau.tahunMobil = 1960;
        MobilHijau.warnaMobil = "Hijau";
        
        System.out.println ("Mobil:" + MobilHijau.merkMobil);
        System.out.println ("Warna Mobil:" + MobilHijau.warnaMobil);
        System.out.println ("Tahun Pembuatan Mobil:"+ MobilHijau.tahunMobil);
                
    }
    
}
