package com.main.repos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Transactions;

@Repository
public class TransactionsRepoImpl implements TransactionsRepo {

	@Autowired
	private EntityManager entityMgnr;

	@Override
	public List<Transactions> get() {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Transactions> query = currentSession.createQuery("from Transactions", Transactions.class);
		List<Transactions> list = query.getResultList();
		return list;
	}

	@Override
	public List<Transactions> get(String cust_id) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Transactions> query = currentSession.createQuery("from Transactions where customer_id="+cust_id, Transactions.class);
		List<Transactions> list = query.getResultList();
		return list;
	}

	@Override
	public void transaction(Transactions transc) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		currentSession.save(transc);
	}

}
