package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokensReccursion {
    static List<String> words = new ArrayList<String>();

    private static boolean flagFinish = false;

    public static void main(String[] args) {
        System.out.println("Enter sth to process: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        tokenSplitter(s);
        System.out.println(words.size());
        for (String string : words) {
            System.out.println(string);
        }
    }

    public static void tokenSplitter(String s) {
        if (exitFromReccursion(s)) {
            flagFinish = true;
        }
        s = removeSpaces(s);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!isDelimiter(ch) && !flagFinish) {
                sb.append(ch);
            } else if (!sb.toString().equals("") && !flagFinish) {
                addToken(sb.toString());
                tokenSplitter(cutTokenFromString(s, sb.toString()));
            } else if (s.length() != 0 && !flagFinish) {
                tokenSplitter(s.substring(1, s.length()));
            }
        }
    }

    private static boolean exitFromReccursion(String s) {
        return s.length() == 0 ? true : false;
    }

    private static String removeSpaces(String s) {
        return s.trim();
    }

    private static String cutTokenFromString(String input, String token) {
        return input.replaceFirst(token, "");
    }

    private static void addToken(String s) {
        words.add(s);
    }

    private static boolean isDelimiter(char c) {
        return Character.toString(c).matches("[\\s!,?._'@]");
    }
}
