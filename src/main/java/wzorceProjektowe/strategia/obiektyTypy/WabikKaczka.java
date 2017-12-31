package wzorceProjektowe.strategia.obiektyTypy;

import wzorceProjektowe.strategia.zachowaniaKwakanie.NieKwacz;
import wzorceProjektowe.strategia.zachowaniaLatanie.NieLatam;

public class WabikKaczka extends Kaczka {
    public WabikKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new NieKwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem wabikiem na kaczki!");
    }
}
