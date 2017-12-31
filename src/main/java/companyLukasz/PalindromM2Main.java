package companyLukasz;

import java.util.ArrayList;
import java.util.List;

public class PalindromM2Main {

    public static void main(String[] args) {

        int iloczyn;

        List<Integer> listaPalindromow = new ArrayList<Integer>();
        for (int mnozna = 10; mnozna < 100; mnozna++) {
            for (int mnoznik = 10; mnoznik < 100; mnoznik++) {
                iloczyn = mnozna * mnoznik;
                if (PalindromM2Utils.isPalindrom(iloczyn)) {
                    listaPalindromow.add(iloczyn);
                    System.out.println(iloczyn);
                }
            }
        }
        System.out.println("Znalazlem " + listaPalindromow.size() + " palindromów.");
    }
}

