package selnium.demo.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
 	
  @Test
  public void f() {
	  
	  System.out.println("In Test1 Method");
  }
  
  
  @Test
  public void a() {
	  
	  System.out.println("In Test2 Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In  Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In Before Class Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In After Class Method");
  }

  @Parameters("browserName")
  @BeforeTest
  public void beforeTest(String browser) {
	  System.out.println("In Before Test Method" + browser);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In After test Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In Before suit Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In after suit Method");
  }

}
