package JavaProgram;

public class ParticularCharCountInString {

	public static void main(String[] args) {

		String string = "This is a Strig for count" ; 
	 
		StringCount(string , "a");
		
	}
	
	public static void StringCount(String str , String ch) {
		
		int result  = str.length()-str.replaceAll(ch , "").length();
		System.out.println(result);
		
		
		
	}
	

}
