/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author WINDOWS 10
 */
public class Game {
   public static void main (String [] args){
       player petani = new player();
       
       petani.name = " Putra ";
       petani.speed = 19;
       petani.healthPoin = 40;
       
       petani.run();
       
       if (petani.isDead()){
           System.out.println("Game Over!");
       }
   } 
}
