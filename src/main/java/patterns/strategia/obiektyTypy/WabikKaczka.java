package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.NieKwacz;
import patterns.strategia.zachowaniaLatanie.NieLatam;

public class WabikKaczka extends Kaczka {
    public WabikKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new NieKwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem wabikiem na kaczki!");
    }
}
