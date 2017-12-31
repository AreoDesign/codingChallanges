package companyLukasz;

/**
 * Zadanie 4. Mechanizm weryfikacji poprawności domknięcia nawiasów.
 * Przykład: (a(c) – ciąg niepoprawny
 * Przykład: )b – ciąg niepoprawny
 * Przykład: (b(s)) – ciąg poprawny
 * Funkcja przyjmuje ciąg znaków alfanumerycznych uzupełniony o nawiasy ( lub ), natomiast ma
 * zwracać flagę: true/false. Cały algorytm ma mieć złożoność O(n). Prosimy o napisanie testów
 * jednostkowych dla tej funkcji.
 */

public class BracketMechanism {

    public static boolean solution(String inp) {
        int counter = 0;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == '(') {
                counter++;
            } else if (inp.charAt(i) == ')') {
                counter--;
            }
            if (i < inp.length() - 1 && inp.charAt(i) == '(' && inp.charAt(i + 1) == ')') return false;
            if (counter < 0) return false;
        }
        return counter == 0;
    }

}
