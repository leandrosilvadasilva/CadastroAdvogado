package br.com.leandro.dev.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.leandro.dev.models.Processo;

public class ProcessoValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Processo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "processoNome", "field.required");
		//ValidationUtils.rejectIfEmpty(errors, "", "");

		
	}

}
