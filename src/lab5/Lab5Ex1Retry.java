package lab5;
import java.util.Scanner;

class AgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  AgeException(String str){
		super(str);
		
	}
}
public class Lab5Ex1Retry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of voter");
		int age = sc.nextInt();
		sc.close();
		try {
			if(age < 15) {
				throw new AgeException ("invalid age");
			} else 
				System.out.println("valid age");
		}
		catch(AgeException e) {
			System.out.println(e);
			
			
		}
	}

}
