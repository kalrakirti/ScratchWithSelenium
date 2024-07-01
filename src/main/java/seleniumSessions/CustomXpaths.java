package seleniumSessions;

public class CustomXpaths {

	public static void main(String[] args) {
		
		//xpath : address of an element in HTML DOM
		
//		      1) absolute xpath  --starts with single /
//					/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/h4/a
//			  2) relative xpath		--starts with //
//					formula
//					xpath axes : relationship : parent, child sibling

		
//		//htmltag[@attr='Value']  
		//input[@type='password'] 
		//input[@name='password'] 
		//input[@placeholder='Password'] 
		
		//input --6 elements , FEs
		//input[@id]
		//input[@placeholder]
		
		//htmltag[@attr1 ='value' and @attr2 ='value' and @attr3 ='value']
		//input[@name ='email' and @id ='input-email']
		//input[@name and @id]
		
		//htmltag[@attr1 ='value' or @attr2 ='value' or @attr3 ='value']
		//input[@name ='email' or @id ='input']
		
		
		//*[@attr = 'value']
		//*[@type = 'text'] --2 elements
		
		
		//text() in xpath
		//htmltag[text() = 'value']
		//legend[text()='Your Personal Details']
		//a[text()='Forgotten Password']
		
		//contains() in xpath 
		//html[contains(@attr,'value')]
		//input[contains(@id,'input')]
		
		//html[contains(@attr,'value') and @attr2 ='value']
		//input[contains(@id,'input') and @name ='email']
		
		
		//html[contains(@attr ='value')] --wrong xpath
		//html[contains(@attr,'value') and contains(@attr2,'value')]
		
		//dynamic ids xpaths
		//id=firstname-123
		//id=firstname-234
		//input[contains(@id,'firstname')]
		
		//contains() with text()
		//htmltag[contains(text(),'value')]
		//p[contains(text(),'By creating')]
		//a[contains(text(),'Contact') and @class='']
		
		//starts-with()
		//htmltag[starts-with(@attr,'value')]
		//a[starts-with(@id,'firstname')]
		//a[starts-with(@id,'firstname') and contains(@attr,'value')]
		
		//starts-with() text()
		//htmltag[starts-with(text(),'value');
		
		//ends-with() not available
		
		//indexing in xpath
//		(//input[@id ])[2]
		
		//position()
//		(//input[@id ])[position() =2]

		//last()
//		(//input[@id ])[last()]

//		(//input[@id ])[last()-2]

//		(//input[@id ])[last()-last()+1] //first element
		
//		 text with space
//		//label[normalize-space()='Yes']
		//label[normalize-space()='No']
	}
	
	
	
	

}
