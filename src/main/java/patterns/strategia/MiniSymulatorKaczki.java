package patterns.strategia;

import patterns.strategia.obiektyTypy.DzikaKaczka;
import patterns.strategia.obiektyTypy.Kaczka;
import patterns.strategia.obiektyTypy.ModelKaczki;
import patterns.strategia.zachowaniaLatanie.LotZNapedemRakietowym;

public class MiniSymulatorKaczki {
    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        Kaczka model = new ModelKaczki();
        model.wykonajLec();
        model.ustawLatanieInterfejs(new LotZNapedemRakietowym());
        model.wykonajLec();
    }
}
