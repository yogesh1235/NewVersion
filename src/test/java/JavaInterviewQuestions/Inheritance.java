package JavaInterviewQuestions;

public class Inheritance {

	//Is- A Relationship
	//Code reusability 
	// Can be achieve by extends keyword
	public static void main (String[] args ) {
		
		Parent p = new Parent();
		p.m1();
		p.m2();   // With parent reference we can not call child class methods. // CE : m2 method is not available 
		
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		Child k = (Child) new Parent();
		k.m1();
		k.m2();
		
		Parent n = new Child();
		n.m1();
		n.m2();   // With parent reference we can not call child class methods. // CE : m2 method is not available 
	}
	
	
	
}


class Parent{
	
	public void m1() {
		
		System.out.println("In M1 of Parent");
		
	}
	
}


class Child extends Parent {
	
	public void m2 () {
		
		System.out.println("In M2 of child");
		
	}
	
}
