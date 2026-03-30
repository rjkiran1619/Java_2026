import java.util.Scanner;

public class scanRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the string");
	   String a = sc.nextLine();
	   String r = "";
	   for (int i = a.length()-1;i>=0;i--)
	   {
		   r += a.charAt(i);
	   }
	   System.out.println(r);
	}

}
