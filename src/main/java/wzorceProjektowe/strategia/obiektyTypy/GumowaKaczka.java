package wzorceProjektowe.strategia.obiektyTypy;

import wzorceProjektowe.strategia.zachowaniaKwakanie.Piszcz;
import wzorceProjektowe.strategia.zachowaniaLatanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Piszcz();
    }

    public void wyswietl() {
        System.out.println("jestem gumowa kaczuszka!");
    }
}
