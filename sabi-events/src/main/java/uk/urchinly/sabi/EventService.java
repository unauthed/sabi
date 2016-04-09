package uk.urchinly.sabi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@Scheduled(fixedRate = 10000)
	public void event() {
		this.simpMessagingTemplate.convertAndSend("/topic/events", "{\"date\": \"" + new Date() + "\"}");
	}
}