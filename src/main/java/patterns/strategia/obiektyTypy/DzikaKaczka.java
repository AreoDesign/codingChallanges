package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.Kwacz;
import patterns.strategia.zachowaniaLatanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    public void wyswietl() {
        System.out.println("Jestem prawdziwa, dzika kaczka!");
    }

}
