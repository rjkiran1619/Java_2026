import java.util.Arrays;

public class sort_each_word {
	
	static void sort(String s) {
		String s1[] = s.split(" n");
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<s1.length;i++) {
			char[] c = s1[i].toCharArray();
			Arrays.sort(c);
			sb.append(c);
			
			if(i<s1.length-1)
				sb.append(" ");
		}
		System.out.print(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sort ("Behind the enmy line");
	}

}
