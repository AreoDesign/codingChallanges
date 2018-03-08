package patterns.strategia.obiektyTypy;

import patterns.strategia.zachowaniaKwakanie.KwakanieInterfejs;
import patterns.strategia.zachowaniaLatanie.LatanieInterfejs;

public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public abstract void wyswietl();

    public void wykonajLec() {
        latanieInterfejs.lec();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void plywaj() {
        System.out.println("Wszystkie kaczki plywaja! Nawet te sztuczne :)");
    }

    public void ustawLatanieInterfejs(LatanieInterfejs li) {
        latanieInterfejs = li;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }

}
