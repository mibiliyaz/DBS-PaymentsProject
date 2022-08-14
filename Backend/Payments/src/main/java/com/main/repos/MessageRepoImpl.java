package com.main.repos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Message;

@Repository
public class MessageRepoImpl implements MessageRepo {

	@Autowired
	private EntityManager entityMgnr;

	@Override
	public List<Message> get() {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Query<Message> query = currentSession.createQuery("from Message", Message.class);
		List<Message> list = query.getResultList();
		return list;
	}

	@Override
	public Message get(String message_code) {
		Session currentSession = entityMgnr.unwrap(Session.class);
		Message msg = currentSession.get(Message.class, message_code);
		return msg;
	}

}
