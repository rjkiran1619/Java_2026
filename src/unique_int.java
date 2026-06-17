import java.util.HashMap;
import java.util.Map.Entry;

public class unique_int 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {3,4,5,6,7,8,5,4,3};
HashMap<Integer, Integer> map = new HashMap<>();
	
for(int num: a) {
	map.put(num, map.getOrDefault(num,0)+1);
	}
System.out.print("Unique Element : ");
for(Entry<Integer, Integer> entry: map.entrySet()) {
	if(entry.getValue()==1) {
		System.out.print(entry.getKey()+ "");
	}
}
}
	}

	



