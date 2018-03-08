package hackerRank;

import java.util.Scanner;

public class StringRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }
}

class MyRegex {
    static String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public static String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
}
