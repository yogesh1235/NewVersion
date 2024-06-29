package JavaProgram;

public class CountNumberOfDigit {

	public static void main(String[] args) {

		
		System.out.println(totalNumber(123457));
		
	}
	
	
	public static int totalNumber(int num) {
		
	int flag=0; 
	 
	while (num!=0) {
		
	
	num = num/10;
	flag++;
	
	System.out.println(num);
			
	}	
	
	return flag;
	}
	

}
