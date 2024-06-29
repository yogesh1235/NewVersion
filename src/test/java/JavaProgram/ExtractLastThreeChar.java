package JavaProgram;

public class ExtractLastThreeChar {

	public static void main(String[] args) {

		String str = "www.google.\\demo\\page.com"; 
		
		String[] temp  = str.split("\\.");
		
		for(String word : temp)
		
		System.out.println(word);
		
		
		
		//Last three Char 
		System.out.println(str.substring(str.length()-3));
		
		
	}

}
