package JavaInterviewQuestions;

public class ExceptionError {

	throwable  //root class
      |
      |
------------------------ 	
|                      |
Exception //Class     Error  //Class    
      
      
//Exceptions are mostly caused by our program and this is recoverable 

//for eg

try {
	//Read data from the file location at london
}

	catch(Exception e ) {
		//If file is not found in the specified location than work with local file and execute the rest of the program normally
	}

// Error are caused by the lack of system resources and these are not recoverable eg: OutOfMemoryError


}




