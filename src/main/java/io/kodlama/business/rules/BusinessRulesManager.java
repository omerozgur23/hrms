package io.kodlama.business.rules;

import org.springframework.stereotype.Service;

@Service
public class BusinessRulesManager implements BusinessRulesService {
	public boolean arePasswordsMatched(String password, String confirmPassword) {
		return password.equals(confirmPassword);
	}

	public String splitDomainName(String email) {
		String[] parts = email.split("@");
		if (parts.length == 2) {
			return parts[1];
		} else {
			throw new IllegalArgumentException("Invalid email format");
		}
	}
}
