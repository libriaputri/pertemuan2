/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author WINDOWS 10
 */
public class MobilBiru {
   public static void main(String[] args) {
       mobil MobilBiru = new mobil();
       
       MobilBiru.merkMobil = "Avanza";
       MobilBiru.warnaMobil = "Biru";
       MobilBiru.tahunMobil = 2000;
       
       System.out.println("Mobil:" + MobilBiru.merkMobil);
       System.out.println("Warna Mobil:" + MobilBiru.warnaMobil);
       System.out.println("Tahun Pembuatan Mobil:" + MobilBiru.tahunMobil);
       
   }  
}
