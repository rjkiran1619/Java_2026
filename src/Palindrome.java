
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Madam";
String b = "";
for (int i = a.length()-1;i>=0;i--) {
	b += a.charAt(i);
}
if(a.equalsIgnoreCase(b))
System.out.println("its a palindrome");
else
	System.out.println("its not a palindrome");
	
	}

}
