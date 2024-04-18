package main;

import java.util.Random;

public class Jatek {
    //ADATTAGOK

    //TAGFÜGVÉNYEK
    /* KONSTRUKTOR, jellemzői:
       - ua. a neve, mint az osztálynak
       - nincs típusa, void sem
       - akkor is van, ha nem írtuk meg, ez az alapértelmezett kstr.
     */
    public Jatek() {
        start();
    }

    void start() {

        System.out.println("Gondoltam egy számra, 0 és 9 között...");
        Random rnd = new Random();

        int szam = rnd.nextInt(10);
        boolean vanNYertes;
        do {
            System.out.println("a kitalálandó szám: " + szam);

            Jatekos jatekos1 = new Jatekos();
            jatekos1.tippel();

            Jatekos jatekos2 = new Jatekos();
            jatekos2.tippel();

            Jatekos jatekos3 = new Jatekos();
            jatekos3.tippel();

            System.out.println("1.játékos tippje: " + jatekos1.tipp);
            System.out.println("2.játékos tippje: " + jatekos2.tipp);
            System.out.println("3.játékos tippje: " + jatekos3.tipp);

            boolean tipp1JO, tipp2JO, tipp3JO;
            tipp1JO = jatekos1.tipp == szam;
            tipp2JO = jatekos2.tipp == szam;
            tipp3JO = jatekos3.tipp == szam;
            vanNYertes = tipp1JO || tipp2JO || tipp3JO;
            if (!vanNYertes) {
                System.out.println("A játékosok újra probálkoznak");
            }
            
        } while (!vanNYertes);
        System.out.println("Van nyertes");
        System.out.println("1.játékos tippje: " + jatekos1.tipp);
        System.out.println("2.játékos tippje: " + jatekos2.tipp);
        System.out.println("3.játékos tippje: " + jatekos3.tipp);

    }
}
