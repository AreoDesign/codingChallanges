package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List<String> tokens = new ArrayList<>();
        StringBuilder singler = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[\\s!,?._'@]") && singler.length() != 0) {
                tokens.add(singler.toString());
                singler = new StringBuilder();
            } else if (i == s.length()-1 && singler.length() != 0) {
                singler.append(s.charAt(i));
                tokens.add(singler.toString());
            } else if (String.valueOf(s.charAt(i)).matches("[\\s!,?._'@]") && singler.length() == 0) {
                continue;
            } else {
                singler.append(s.charAt(i));
            }
        }
        System.out.println(tokens.size());
        for (String word : tokens) {
            System.out.println(word);
        }
    }
}

