package org.spring.mvc;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class BloodGrpValidator implements ConstraintValidator<IsValidBloodGrp, String> {
 
    @Override
    public void initialize(IsValidBloodGrp isValidHobby) { 
    	
    }
 
    @Override
    public boolean isValid(String studentBloodGrp, ConstraintValidatorContext ctx) {
        
    	if(studentBloodGrp == null) {
    		
            return false;
        }
        
    	if (studentBloodGrp.matches("Opositive|Bpositive|ABpositive")) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
 
}