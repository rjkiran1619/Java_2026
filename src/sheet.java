class sheet
{
public static void main(String[] args) {
	//program to check the largest number
  int[] a = {32,32,34,466,77};
  int b = a[0];
  for(int i=1;i<a.length;i++) {
	if(a[i]>b)b=a[i];
  }
  System.out.println(b);
  }}