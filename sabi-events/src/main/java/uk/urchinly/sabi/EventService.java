package uk.urchinly.sabi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private SimpMessagingTemplate template;

	@Scheduled(fixedRate = 5000)
	public void trigger() {
		this.template.convertAndSend("/topic/events", "Date: " + new Date());
	}

}