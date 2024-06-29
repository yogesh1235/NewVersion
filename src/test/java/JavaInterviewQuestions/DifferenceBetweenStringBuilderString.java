package JavaInterviewQuestions;

public class DifferenceBetweenStringBuilderString {

	public static void main(String[] args) {

		
		// String StringBuffer  StringBuilder
		
		// Strings are immutable 
		//StringBuffer is mutable
		//StringBuilder is mutable 
		
		// if the content is fixed and wont change frequently and immutable is required we should go for Strings 
		
		
		// if the content is  not fixed and  change frequently and mutable is required we should go for StringsBuffer and StringBuilder 
		
		
		// When only one thread should be allowed to work on object we should go for StringBuffer (Thread safety)
		
		// When multiple threads should be allowed to work on object we should go for StringBuilder ( No Thread safety)
		
		String str = new String ("This is Yogesh");
		str.concat("To the new");
		
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder("This is yogesh");
		sb.append("  To the new ");
		System.out.println(sb);
	}

}
