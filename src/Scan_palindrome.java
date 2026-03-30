import java.util.Scanner;

public class Scan_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    	System.out.println("enter the string to check palindrome : ");
        String a = sc.nextLine();
        String b = "";
        for (int i=a.length()-1; i>=0;i--) {
        	b += a.charAt(i);
        }
        if (a.equalsIgnoreCase(b))
        	System.out.println("its a palindrome");
        else
        	System.out.println("not a palindrome");
        
	}

}
