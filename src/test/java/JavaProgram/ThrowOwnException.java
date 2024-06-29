package JavaProgram;

public class ThrowOwnException {


	public static void main(String[] args) {

		int j = 20 ; 
		int i =0 ; 

		try {

			j = 18/i;

			if(j==0)
				
				throw new YogeshException("I dont want to print 0");

		} 


		catch (YogeshException e) {

			j = 18/1;

			System.out.println("that is the default exception" +e);

		}

		catch(Exception e ) {

			System.out.println("Something went wrong.."  + e);


		}


	}

}


class YogeshException extends Exception {
	
	public YogeshException(String string) {
		
		super(string);
		
	}
	
}
