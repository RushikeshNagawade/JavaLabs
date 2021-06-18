package lab5;


class InvalidVoterException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidVoterException(String s) {
		super(s);
	}
	
}
public class Lab5Ex1  {

		void checkAge( int age) throws InvalidVoterException {
			if ( age < 15) {
				throw new InvalidVoterException("Not Eligible");
			} else System.out.println("You can vote");
		}
		
		public static void main(String[] args) {
		
			Lab5Ex1 obj = new Lab5Ex1();
			try {
				obj.checkAge(1);
			} catch(InvalidVoterException e) {
				System.out.println("Voter");
				System.out.println(e);
				
				
			}
			
		
		
		}

}
