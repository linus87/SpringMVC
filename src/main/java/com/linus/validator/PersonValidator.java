package com.linus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.linus.vo.Person;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username",
				"username.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"password.empty");
		Person p = (Person) obj;
		if (p.getPassword().length() < 8) {
			errors.rejectValue("password", "password.tooshort");
		} else if (p.getPassword().length() > 20) {
			errors.rejectValue("password", "password.toolong");
		}
	}
}
