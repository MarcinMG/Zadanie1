import java.util.*; 
import java.lang.*;
import java.io.*;

class UserValidator {
	
	public boolean validateName(String name) {
		
		return (name != null);
	
	}
	
	public boolean validateAgeAndHeight(double age, double height) {
			
		return (age > 30 && height > 160);
	}
}


class Kodilla {
	
   public static void main (String[] args) throws java.lang.Exception {
   	
		String name = "Adam"; //nie tworze atrubutow klasy
		double age = 40.5;  
		double height = 178;
		
		UserValidator validator = new UserValidator();
		
		boolean isNameString = validator.validateName(name);
		boolean isAgeOver30AndHeightOver160 = validator.validateAgeAndHeight(age, height);
		
		if(isNameString) {
			
			if(isAgeOver30AndHeightOver160)
				System.out.println("User is older than 30 and higher then 160cm");
			else 
				System.out.println("User is younger than 30 or lower than 160cm");
		
		}
   }
}