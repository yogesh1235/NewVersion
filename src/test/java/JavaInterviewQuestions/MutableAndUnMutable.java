package JavaInterviewQuestions;

public class MutableAndUnMutable {

	public static void main(String[] args) {

		//String is immutable
		String s = new String("Yogesh");
		s.concat(" Aggarwal");     // New Object created and can't change in existing object 
		System.out.println(s);    // op : Yogesh
		
		//StringBuffer is mutable
		StringBuffer sb = new StringBuffer("Yogesh");
		sb.append(" Aggarwal");
		System.out.println(sb);  // op : Yogesh Aggarwal
		
		
		String str = "String "; 
		str.concat("Aggarwal");  // New Object created and can't change in existing object 
		System.out.println(str);  // op: String 
		
	}

}
