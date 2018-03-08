package preinterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MorseAlphabetTranslation {

    private static Map<String, String> morseAlphabet = new HashMap<String, String>();

    static {
        morseAlphabet.put("A", ".-");
        morseAlphabet.put("L", ".-..");
        morseAlphabet.put("M", "--");
        morseAlphabet.put("K", "-.-");
        morseAlphabet.put("O", "---");
        morseAlphabet.put("T", "-");
        morseAlphabet.put("U", "..-");
        morseAlphabet.put("B", "-...");
        morseAlphabet.put("I", "..");
        morseAlphabet.put("E", ".");
        morseAlphabet.put("P", ".--.");
        morseAlphabet.put("R", ".-.");
        morseAlphabet.put("G", "--.");
        morseAlphabet.put("W", ".--");
        morseAlphabet.put("C", "-.-.");
    }

    public static String solution(String inp) {
        StringBuilder out = new StringBuilder();
        //translation from Morse to Letter
        if (inp.matches("[-/./\\u0020]+")) {
            StringBuilder inp_temp = new StringBuilder(inp);
            String letter;
            while (inp_temp.length()!=0) { //!inp_temp.equals("") ||
                letter = getMorseLetter(cleanFromSpace(inp_temp));
                String translatedLetter = callTranslate(morseAlphabet, letter);
                out.append(translatedLetter);
                inp_temp = (inp_temp.length()!=0) ? inp_temp.delete(0, letter.length()+1) : null;
            }
            //translation from Letter to Morse
        } else {
            inp = inp.trim();
            for (int i = 0; i < inp.length(); i++) {
                if (inp.charAt(i)==' '){
                    continue;
                }
                out.append(morseAlphabet.get(inp.substring(i, i + 1))).append(" ");
            }
        }
        return out.toString();
    }

    private static String callTranslate(Map<String, String> map, String value) {
        Set<Map.Entry<String, String>> os = map.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(value))
                .collect(Collectors.toSet());
        return os.iterator().next().getKey();
    }

    private static StringBuilder cleanFromSpace(StringBuilder inputStr) {
        return new StringBuilder(inputStr.toString().trim());
    }

    private static String getMorseLetter(StringBuilder inputStr) {
        return (inputStr.indexOf(" ")!=-1) ? inputStr.substring(0, inputStr.indexOf(" ")) : inputStr.substring(0, inputStr.length());
    }

    public static void main(String[] args) {
        System.out.println(solution(".- .-.. .- -- .- -.- --- - .-"));
        System.out.println(solution("ALA MA KOTA"));
    }

}

