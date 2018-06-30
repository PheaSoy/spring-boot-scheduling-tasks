package org.soyphea.springboot.sceduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTasks {
	
    private static final Logger log = LoggerFactory.getLogger(MyTasks.class);

	@Scheduled(fixedRate=5000)
	public void executedFixedRate() {
		
		log.info("I am a task running on scheduled fixedRate.");
		
	}
	
	@Scheduled(fixedDelay=5000)
	public void executedFixedDelay() {
		
		log.info("I am a task running on scheduled fixedDelay.");
		
	}
	@Scheduled(cron="*/10 * * * * *")
	public void executeCdronJobs() {
		
		log.info("I am a task running on scheduled as cron job every 10s.");
		
	}
}
