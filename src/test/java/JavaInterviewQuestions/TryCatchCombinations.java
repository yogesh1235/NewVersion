package JavaInterviewQuestions;

public class TryCatchCombinations {

	private void psvm() {

//Fine
	try {
		
	}
	
	catch (Exception e)
	{
		
	}
	
//=================//

	//CE: Exception X has already been caught
try {
	
}

catch (X e)
{
	
}
	
catch (X e) {
	
}
	
//=================//

//Valid
try {
	
}

catch (X e)
{
	
}
	
catch (Y e) {
	
}

//=================//

//CE: Exception Java.lang.AE has already been caught
try {
	
}

catch (Exception e)
{
	
}
	
catch (AE e) {
	
}
	

//=================//
//Valid
try {
	
}

catch (AE e)
{
	
}
	
catch (Exception e) {
	
}

//=================//
//CE: Try without catch or finally 
try {
	
}

//=================//
//catch without finally block
catch (Exception e) {
	
}

//=================//
//finally without try block

finally {
	
}

//=================//
//Valid
try {
	
}

finally {
	
}

//=================//
//invalid CE: catch without finally block
try {
	
}
System.out.println("Hello");

catch{
	
}


	}
}
