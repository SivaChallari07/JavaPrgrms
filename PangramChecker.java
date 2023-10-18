package javaPrgrms;

import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	System.out.println("Enter String");
        String input = new Scanner(System.in).nextLine();
        boolean isPangram = isPangram(input);
        System.out.println("Is it a pangram? " + isPangram);
    }
}
