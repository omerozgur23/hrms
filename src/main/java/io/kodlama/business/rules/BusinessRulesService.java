package io.kodlama.business.rules;

public interface BusinessRulesService {
	boolean arePasswordsMatched(String password, String confirmPassword);

	String splitDomainName(String email);
}
