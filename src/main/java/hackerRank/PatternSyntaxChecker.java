package hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] strings = new String[testCases];
        while (testCases > 0) {
            String pattern = in.nextLine();
            strings[strings.length - testCases] = pattern;
            testCases--;
        }
        for (int i = 0; i < strings.length; i++) {
            try {
                Pattern.compile(strings[i]);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
        }
    }

}
