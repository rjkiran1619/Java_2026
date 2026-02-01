import java.util.Arrays;

public class Annagram {
static void anna(String s1, String s2){
	char[] c1= s1.toLowerCase().toCharArray();
	char[] c2= s2.toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	if(Arrays.equals(c1,c2))
		System.out.println("not a anagram");
	else 
		System.out.println("Its a anagram");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         anna ("silent","listen");
	}

}
