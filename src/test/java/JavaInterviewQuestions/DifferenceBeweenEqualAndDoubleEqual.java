package JavaInterviewQuestions;

public class DifferenceBeweenEqualAndDoubleEqual {

	public static void main(String[] args) {

         // == ment for reference comparison / address comparison 
		// .equals ment for content comparison 
		
		String s1 = new String ("Yogesh"); 
		
		String s2 = new String ("Yogesh");
		
		
		System.out.println(s1==s2);  // op : false this is for reference comparison  
		System.out.println(s1.equals(s2)); //  op True this is for content comparison

		
		
		
	}

}
