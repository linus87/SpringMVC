package com.linus.excel.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.linus.excel.po.User;

public class UserValidator implements ConstraintValidator<UserChecker, User> {

	@Override
	public void initialize(UserChecker constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(User user, ConstraintValidatorContext context) {
		if ("no".equalsIgnoreCase(user.getFree())) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("{validation.excel.user.shippingFee.message}")
				.addConstraintViolation();
			
			return user.getShippingFee() > 0;
		}
		
		return true;
	}

}
