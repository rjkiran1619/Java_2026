import java.util.Scanner;
public class vowel_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = sc.nextLine().toLowerCase();
		String vowel = "aeiou";
		int count = 0;
		for(char ch: input.toCharArray()) {
			if(vowel.contains(String.valueOf(ch))) {
				count++;
			}
		}
	System.out.println(count);
	sc.close();
	
	}

}


//Enter the string :
//rajaran
//3
//