/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Random;

public class Jatek {
    //public Jatek() {
    //}
    void start(){
        
        System.out.println("Gondoltam egy számra, 0 és 9 között....");
        
        Random rnd =new Random();
        int szam=rnd.nextInt(10);
        System.out.println("a kitalálandó szám: "+szam);
    }
    
}
