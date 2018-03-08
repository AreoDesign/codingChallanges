package preinterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Zadanie 2. Palindrom
 * Palindrom to liczba którą czyta się w taki sam sposób od przodu i od tyłu. Napisz program który
 * wypisze wszystkie palindromy powstałe z pomnożenia przez siebie liczb dwucyfrowych (10-99).
 * Prosimy o nieużywanie przekształcenia do String'a.
 * Przykłady palindromów:
 * 9009 = 91 * 99
 * 2552 = 44 * 58
 */

public class Palindrom {

    /**
     * 101, 202, 303 -> 101
     * 111, 212, 313 -> 101
     * 121, 222, 323 -> 101
     * +10, +10, +10  (X10)
     * ............. 202-191=11 (each 11)
     * 191, 292, 393 -> 101
     * 1001, 2002, 3003 -> 1001
     * 1111, 2112, 3113 -> 1001
     * +110, +110, +110 (X10)
     * ............. 2002-1991=11 (each 11)
     * 1991, 2992, 3993 -> 1001
     */

    /**
     * This method will find all numbers greater than 10*10 and lower than 99*99 which are PALINDROMS
     * @return List of Integers which are Palindroms
     */
    public static List<Integer> getPalindromList() {
        List<Integer> allPalindromNums = new ArrayList<Integer>();
        int adder;
        int loopCount = 0;
        int lastListInt = 101;
        allPalindromNums.add(lastListInt);
        for (int i = 1; i <= 9; i++) {
            lastListInt = allPalindromNums.get(allPalindromNums.size() - 1);
            for (int j = 1; j <= 9; j++) {
                adder = (loopCount == 0) ? 10 : 110;
                if (allPalindromNums.get(allPalindromNums.size() - 1) > 99 * 99) break;
                allPalindromNums.add(lastListInt + j * adder);
                if (i == 9 && j == 9) {
                    loopCount++;
                    i = (loopCount != 0) ? 1 : i;
                }
            }
            if (allPalindromNums.get(allPalindromNums.size() - 1) > 99 * 99) break;
            adder = ((allPalindromNums.get(allPalindromNums.size() - 1)% 999) == 0) ? 2 : 11;
            allPalindromNums.add(allPalindromNums.get(allPalindromNums.size() - 1) + adder);
        }
        return allPalindromNums;
    }

    /**
     * Purpose of this method is to find Palindroms form scope 10*10 <= Palindrom <= 99*99 which have integer factors
     * @param inpList - List of Integers which are Palindroms
     * @return Palindroms which have int factors from scope 10-99
     */
    public static Set<Integer> showPalindromSolution(List<Integer> inpList){
        Set<Integer> validPalindroms = new TreeSet<Integer>();
        for (Integer curr : inpList){
            for (int i = 10 ; i < curr/10; i++){
                if (curr%i==0) validPalindroms.add(curr);
            }
        }
        return validPalindroms;
    }

    public static void main(String[] args) {
        System.out.println(getPalindromList());
        System.out.println(showPalindromSolution(getPalindromList()));
    }
}

