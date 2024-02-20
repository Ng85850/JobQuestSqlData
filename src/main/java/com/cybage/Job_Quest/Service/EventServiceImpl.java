package com.cybage.Job_Quest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.Job_Quest.model.Event;
import com.cybage.Job_Quest.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository eventRepoository;

	@Override
	public void saveEvents(Event event) {
		// TODO Auto-generated method stub
		eventRepoository.saveEvents(event);		
	}
	
	
	
	
}
