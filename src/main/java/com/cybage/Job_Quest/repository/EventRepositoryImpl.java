package com.cybage.Job_Quest.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.Job_Quest.model.Event;

@Repository
public class EventRepositoryImpl implements EventRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void saveEvents(Event event) {
		entityManager.persist(event);
	}

}
