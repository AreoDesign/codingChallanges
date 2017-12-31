package wzorceProjektowe.strategia.obiektyTypy;

import wzorceProjektowe.strategia.zachowaniaKwakanie.Kwacz;
import wzorceProjektowe.strategia.zachowaniaLatanie.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka{
    public PlaskonosKaczka() {
        latanieInterfejs = new LatamBoMamSkrzydla();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem kaczka plaskonosa");
    }
}
