package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.Piszcz;
import patterns.strategia.zachowaniaLatanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Piszcz();
    }

    public void wyswietl() {
        System.out.println("jestem gumowa kaczuszka!");
    }
}
