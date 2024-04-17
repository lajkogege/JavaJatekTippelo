/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

public class JatekIndito {

    public static void main(String[] args) {
        /*referencia nélkül hivjuk az objektum metodusát*/
       //new Jatek().start();
       
       /*Referenciát adunk az objektumra, és azon keresztül hivjuk*/
       Jatek referencia= new Jatek();
       referencia.start();
       
       /*Csak a kkonstrukort hívjuk*/
       //new Jatek();
    }
    
}
