package wzorceProjektowe.strategia.obiektyTypy;

import wzorceProjektowe.strategia.zachowaniaKwakanie.Kwacz;
import wzorceProjektowe.strategia.zachowaniaLatanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    public void wyswietl() {
        System.out.println("Jestem prawdziwa, dzika kaczka!");
    }

}
