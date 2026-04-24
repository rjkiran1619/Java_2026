
public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a = "Programming";
    char[] c = a.toCharArray();
    for(int i = 0; i<c.length;i++)
    {
    	int count =1;
    	if(c[i]==0) continue;
    	for(int j = i+1; j<c.length;j++) {
    		if(c[i]==c[j]) {
    			count++;
    			c[j]=0;
    		}
    	}
    	if (count>1) {
    		System.out.println(c[i]+":"+count);
    	}
    }
    		
	}

}
