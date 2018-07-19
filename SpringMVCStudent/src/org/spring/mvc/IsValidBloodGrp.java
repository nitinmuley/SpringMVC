package org.spring.mvc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
 
@Documented
@Constraint(validatedBy = BloodGrpValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidBloodGrp {
	
    String message() default "Please provide a valid Blood group; " +
    		"accepted Blood groups are - Opositive, Bpositive, ABpositive  ( choose anyone )";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
       
}