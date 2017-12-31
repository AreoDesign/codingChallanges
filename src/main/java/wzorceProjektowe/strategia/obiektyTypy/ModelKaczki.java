package wzorceProjektowe.strategia.obiektyTypy;

import wzorceProjektowe.strategia.zachowaniaKwakanie.Kwacz;
import wzorceProjektowe.strategia.zachowaniaLatanie.NieLatam;

public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem modelem kaczki!");
    }

}
