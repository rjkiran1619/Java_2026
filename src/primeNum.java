
public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 24
				;
		boolean prime = true;
		if(n<=1) prime = false;
		
		for(int i =2; i<=n/2; i++) {
			if (n%i==0) {
				prime = false;
				break;
			}
		}
			
		System.out.println(prime? "Prime":"nonPrime");
	}

}
