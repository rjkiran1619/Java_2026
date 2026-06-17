import java.util.Scanner;

public class reverse_sting_part {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
			
    String a  = c.nextLine();
    String[] b = a.split(" ");
    for(int i =b.length-1; i>=0; i --)
    	System.out.print(b[i]+ " ");
	}

}
