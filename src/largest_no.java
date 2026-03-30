
public class largest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr  = {20,44,55,632,21,1};
    int max = arr[0];
    for(int i = 1; i<arr.length; i++)
    {
    	if(arr[i]>max)max=arr[i];
    			
    }
    System.out.println("largest number is : " +max);
	}

}
