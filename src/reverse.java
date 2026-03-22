
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a = ("this is a string");
    String result ="";
    for (int i = a.length()-1;i>=0;i--) {
    	result += a.charAt(i);
    }
    System.out.println(result);
	}

}
