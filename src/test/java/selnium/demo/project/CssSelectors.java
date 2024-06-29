package selnium.demo.project;

public class CssSelectors {

	public static void main(String[] args) {

		//Tag and ID 
		
		//Id is represented by #
		// By.CssSelector('#email')
		// TagName# Value of ID 
		// input#email
		
		
		//Tag and class 
		// Class is represented by .
		//.inputtext 
		
		//Tag and attribute 
		
		// [name = email] // input[name=email]
		
		
		
//=========================================//

// Xpaths 

//OR 

 //input[@id='search_query' or @name='search_query']

//AND

//input[@id='search_query' and @name='search_query']

//contains()

//tagname[contains(@attribute, 'value')]

//start-with()

		//tagname[start-with(@attribute, 'value')]
		
//text()
		//tagname[text()='value']

//chained xpath
		
		//input[@id='search_query']//a[@name='search_query']
		

//=========================================//

	//	xapth  Axes
		
//Self
		//a[contains(@text(),'india Tourism De')]/self::a

//Parent
		//a[contains(@text(),'india Tourism De')]/parent::td     //if we dont know how many or which is the parent we can use * eg //a[contains(@text(),'india Tourism De')]/parent::*
		
//Child 
		//a[contains(@text(),'india Tourism De')]/child::a      //if we dont know how many or which is the child we can use * eg //a[contains(@text(),'india Tourism De')]/child::*
		
//Ancestor
		//a[contains(@text(),'india Tourism De')]/ancestor::a
//Descendant
		//i[@aria-label='Prime Eligible']/parent::a/descendant::input    //We can add multiple axes for xpath
//Following
		//i[@aria-label='Prime Eligible']/parent::a/following::div   //this will return all the nodes after the current node
		
//Following-sibling
		//i[@aria-label='Prime Eligible']/parent::a/following-sibling::div /this will return all the nodes after the current node along with child
//Preceding
		//i[@aria-label='Prime Eligible']/parent::a///preceding::div   // this will return all the nodes above the current node
//Preceding-sibling
		//i[@aria-label='Prime Eligible']/parent::a/preceding-sibling::div  // this will return all the nodes above the current node along with child
		
	}

}
