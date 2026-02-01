import java.util.Arrays;
import java.util.Scanner;

public class scan_ana {
    static void anna(String s1, String s2) {
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) 
            System.out.println("It's an anagram");
        else 
            System.out.println("Not an anagram");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String s2 = sc.nextLine();

        anna(s1, s2);

        sc.close();
    }
}