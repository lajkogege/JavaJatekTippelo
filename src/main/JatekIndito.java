package main;

public class JatekIndito {
    
    public static void main(String[] args) {
        /* nincs referencia az objektumra: */
        //new Jatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Jatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
        new Jatek();
        
////      3 játékos tippel
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        HIBA
////      1 játékos tippel 3-szor, ez nem jó
//        Jatekos j=new Jatekos();
//        j.tippel();
//        j.tippel();
//        j.tippel();
    }
}
