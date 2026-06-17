import java.util.Random;
public class otp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random = new Random();
int otp = 1000 + random.nextInt(9999);
	System.out.print("otp: " +otp);
	
	}

}
