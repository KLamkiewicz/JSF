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
		
		int wagi[] = {8,9,2,3,4,5,6,7};
		String regon = (String) value;
		
		FacesMessage message = new FacesMessage();
		//message.setDetail("Regon musi składać się z 9 cyfr");
		message.setSummary("REGON musi składać się z 9 cyfr");
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		
		if(regon.length()==9){
			message.setSummary("Bledny REGON");
			int regonNumbers[] = new int[8];
			int controlSum=0;
			for(int i=0; i<=7; i++){
				regonNumbers[i] = Character.getNumericValue(regon.charAt(i));
				controlSum+=wagi[i]*regonNumbers[i];
			}
			if(controlSum%11==10)
				controlSum=0;
			
			if(controlSum%11!=Character.getNumericValue(regon.charAt(8))){
				throw new ValidatorException(message);
			}
				
		}
		else{
			throw new ValidatorException(message);
		}
	}

}
