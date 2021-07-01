package com.indranil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.indranil.model.Account;
import com.indranil.util.PersistenceManager;

@Repository
public class AccountDaoImpl implements AccountDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAccounts() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		Query query = em.createQuery("SELECT a FROM Account a");

		List<Account> result = query.getResultList();
		return result;
	}

	@Override
	public boolean saveAccount(Account account) {
		return false;
	}

	@Override
	public Account getAccount(String id) {
		return null;
	}

}
