package companyLukasz;

public class PalindromM2Utils {

    static boolean isPalindrom(int valueToCheck) {
        int pozycjaCyfryPrawej = 1;
        int dlugoscLiczby = getLength(valueToCheck);

        while (dlugoscLiczby - pozycjaCyfryPrawej > 0) {

            if (czySkrajneCyfrySaRowne(valueToCheck, pozycjaCyfryPrawej)) {
                pozycjaCyfryPrawej++;
            } else {
                return false;
            }
        }
        return true;
    }

    static int skrocLiczbeOOstatniaCyfre(int valueToCheck) {
        return (int) valueToCheck / 10;
    }

    static int skrocLiczbeOPierwszaCyfre(int valueToCheck) {
        int dlugoscLiczby = getLength(valueToCheck);
        int skrajnieLewaCyfra = pobierzCyfre(valueToCheck, dlugoscLiczby);
        return valueToCheck - skrajnieLewaCyfra * getPow(dlugoscLiczby);
    }

    static boolean czySkrajneCyfrySaRowne(int valueToCheck, int pozycjaCyfryPrawej) {
        int variableLegth = getLength(valueToCheck);
        int cyfraPoLewejStronie = pobierzCyfre(valueToCheck, variableLegth - pozycjaCyfryPrawej + 1);
        int cyfraPoPrawejStronie = pobierzCyfre(valueToCheck, pozycjaCyfryPrawej);
        return cyfraPoLewejStronie == cyfraPoPrawejStronie;
    }

    static int pobierzCyfre(int value, int pozycjaCyfry) {
        value = (int) (value / getPow(pozycjaCyfry));
        for (int i = 0; i < 10; i++) {
            if ((value - i) % 10 == 0) {
                return i;
            }
        }
        return 0;
    }

    private static int getPow(int variableLegth) {
        return (int) Math.pow(10, variableLegth - 1);
    }

    static int getLength(int value) {
        if (value < 0) {
            value = value * -1;
        }
        int initialDzielnik = 1;
        int counter = 1;
        while (value / initialDzielnik > 10) {
            initialDzielnik = initialDzielnik * 10;
            counter++;
        }
        return counter;
    }
}

