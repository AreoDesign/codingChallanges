package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.Kwacz;
import patterns.strategia.zachowaniaLatanie.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka{
    public PlaskonosKaczka() {
        latanieInterfejs = new LatamBoMamSkrzydla();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem kaczka plaskonosa");
    }
}
