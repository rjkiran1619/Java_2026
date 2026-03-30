
public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "This is count words";
		int count = 0;
		boolean word = false;
		for (int i =0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
				if(!word) {
					count++;
					word = true;
					
				}
			}
			else {
				word = false;
			}
					}
	System.out.print(count);
	}

}
