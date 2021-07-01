package com.indranil.dao;

import java.util.List;

import com.indranil.model.Account;

public interface AccountDao {

	abstract List<Account> getAccounts();

	abstract boolean saveAccount(Account account);

	abstract Account getAccount(String id);

}
