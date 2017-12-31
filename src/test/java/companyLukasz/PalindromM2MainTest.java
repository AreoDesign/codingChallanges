/*
package package1;

import spock.lang.Specification;

public class Zadanie2Sposob2UtilsTest extends Specification {

    def "isPalindrom"()

    {
        expect:
        Zadanie2Sposob2Utils.isPalindrom(value) == wynik
        where:
        value || wynik
        1 || true

        77 || true
        12 || false

        323 || true
        123 || false

        3223 || true
        3023 || false

        25752 || true
        35752 || false
        20702 || true

        23455432 || true
        23409432 || false
    }

    def "skrocLiczbeOOstatniaCyfre"()

    {
        expect:
        Zadanie2Sposob2Utils.skrocLiczbeOOstatniaCyfre(value) == nowaLiczba
        where:
        value || nowaLiczba
        123456789 || 12345678
        987654321 || 98765432
        234 || 23
    }

    def "skrocLiczbeOPierwszaCyfre"()

    {
        expect:
        Zadanie2Sposob2Utils.skrocLiczbeOPierwszaCyfre(value) == nowaLiczba
        where:
        value || nowaLiczba
        22 || 2
        25 || 5
        123456789 || 23456789
    }

    def "czySkrajneCyfrySaRowne"()

    {
        expect:
        Zadanie2Sposob2Utils.czySkrajneCyfrySaRowne(vale, pozycjaCyfryPoPrawej) == czySoRowne
        where:
        vale || pozycjaCyfryPoPrawej || czySoRowne
        22 || 1 || true
        222 || 1 || true
        223 || 1 || false
        2562 || 1 || true
        348563 || 1 || true
        37448563 || 1 || true
        37448561 || 4 || false
        23844993 || 4 || true
    }

    def "Pobierz cyfre"()

    {
        expect:
        Zadanie2Sposob2Utils.pobierzCyfre(value, numerCyfryDoPobrania) == result
        where:
        value || numerCyfryDoPobrania || result
        1 || 1 || 1
        89 || 1 || 9
        89 || 2 || 8
        657 || 1 || 7
        657 || 2 || 5
        657 || 3 || 6
        2147483647 || 10 || 2
        2147483647 || 6 || 4
    }

    def "Get length dla dodatnich"()

    {
        expect:
        Zadanie2Sposob2Utils.getLength(value) == result
        where:
        value || result
        1 || 1
        22 || 2
        123 || 3
        1234 || 4
        44444 || 5
    }

    def "Get length dla ujemnych"()

    {
        expect:
        Zadanie2Sposob2Utils.getLength(value) == result
        where:
        value || result
                (-22) || 2
        (-123) || 3
        (-1234) || 4
        (-44444) || 5
    }

    def "Get length dla zero"()

    {
        expect:
        Zadanie2Sposob2Utils.getLength(0) == 1
    }

}
*/
