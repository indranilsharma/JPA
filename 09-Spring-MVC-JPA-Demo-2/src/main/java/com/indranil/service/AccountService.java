package com.indranil.service;

import com.indranil.model.Account;

public interface AccountService {
	abstract boolean saveAccount(Account account);

	abstract Account getAccount(String id);
}
