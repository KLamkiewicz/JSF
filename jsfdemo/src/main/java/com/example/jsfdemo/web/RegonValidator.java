package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("regonValidator")
public class RegonValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String regon = (String) value;
		
		if(regon.length()==9){
			int regonNumbers[] = new int[8];
			for(int i=0; i<=7; i++){
				regonNumbers[i] = regon.charAt(i);
			}
				
		}
		else{
			FacesMessage message = new FacesMessage();
			message.setDetail("Regon musi składać się z 9 cyfr");
			message.setSummary("Regon musi składać się z 9 cyfr");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
