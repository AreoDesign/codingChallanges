package wzorceProjektowe.strategia;

import wzorceProjektowe.strategia.obiektyTypy.DzikaKaczka;
import wzorceProjektowe.strategia.obiektyTypy.Kaczka;
import wzorceProjektowe.strategia.obiektyTypy.ModelKaczki;
import wzorceProjektowe.strategia.zachowaniaLatanie.LotZNapedemRakietowym;

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
