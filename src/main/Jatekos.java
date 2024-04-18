package main;

import java.util.Random;

public class Jatekos {

    //ADATTAGOK
    int tipp;
    Random rnd = new Random();

    //TAGFÜVÉNY
    void tippel() {
       
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
