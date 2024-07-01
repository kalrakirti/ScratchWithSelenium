package config;

public class XPathAxesConcept {

	public static void main(String[] args) {
		
//		TWo // indirect and direct association
//		one/ direct association
		
		//div[@id='content']//form
		
		//select[@id='Form_getForm_Country']//option

//		(//div[@class='form-group']/input)[1]
//				(//div[@class='form-group'])[1]/input
						
//		(//div[@class='form-group'])[2]/a
		
		//input[@id='input-email']/..
		//input[@id='input-email']/parent::div
		//option[@value='Algeria']/parent:: select
		
//		parent will only work for immediate parent
		//option[@value='Algeria']/parent:: select/parent::div 		//grandparent
		//input[@id='input-email']/ancestor::form
		//input[@id='input-email']/ancestor::div
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
	}

}
