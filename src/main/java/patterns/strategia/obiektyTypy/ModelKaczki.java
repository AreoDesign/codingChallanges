package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.Kwacz;
import patterns.strategia.zachowaniaLatanie.NieLatam;

public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyswietl() {
        System.out.println("Jestem modelem kaczki!");
    }

}
