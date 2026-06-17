import java.util.HashSet;

public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a = {4,5,6,7,22,11,11,22,33,5};
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> dub = new HashSet<>();
    for(int num:a) {
    	if(seen.contains(num)) {
    		dub.add(num);}
    	else {
    		seen.add(num);
    	}
    	}
    System.out.print("Dublicate element: " +dub);
 
    }
	}


