//Write a program to check the number of occurence count in a string//

public class Occurence {
    static void countChar(String s) {
        char[] s1 = s.toLowerCase().toCharArray();
        for (int i = 0; i < s1.length; i++) {
            int count = 1;
            if (s1[i] == ' ') continue; // skip already counted chars
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] == s1[j]) {
                    count++;
                    s1[j] = ' '; // mark as counted
                }
            }
            System.out.println(s1[i] + ":" + count);
        }
    }

    public static void main(String[] args) {
        countChar("Rajesha");
    }
}
