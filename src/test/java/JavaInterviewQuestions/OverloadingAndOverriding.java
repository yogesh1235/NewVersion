package JavaInterviewQuestions;

public class OverloadingAndOverriding {

//Overloaded method have same name but different argument
	public void m1(int i) {
		
				
	}
	
	
	public void m1(long i) {
		
		
	}
	
// 
	
	
}


 class P{
	
	public void property() {
		
		System.out.println("In parent");
	}
	
	//Overridden Method
	public void marry() {
		System.out.println("in Marry");
	}
	
}
 
 class C extends P{

	 //  Overriding 
	 
	 //Overriding method
	 public void marry() {
			System.out.println("in Marry child");
		}
	 P p = new  C();
	 
 }
 
 
 
 
