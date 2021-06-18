package lab5;


class InvalidNameException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidNameException (String str) {
		super(str);
	}
	
}

public class Lab5Ex2 {
	public static void main(String[] args) {
		
		
		String firstName = " " ;
		String lastName = "Monu";
//		System.out.println(firstName + lastName);
		
		try {
			if (firstName.isBlank() || lastName.isBlank()) {
				throw new InvalidNameException(" Name cannot be empty");
			} else System.out.println(firstName);
			
		} catch (InvalidNameException e) {
//			System.out.println(e);
			e.printStackTrace(); 
		}
	}

}
