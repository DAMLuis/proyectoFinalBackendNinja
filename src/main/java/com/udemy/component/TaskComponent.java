package com.udemy.component;

import org.apache.commons.logging.LogFactory;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ejecuta el metodo cada tiempo 
 * @author Luis
 *
 */
@Component("taskComponent")
public class TaskComponent {
	
	private static final Log LOG = LogFactory.getLog(TaskComponent.class);
	
	@Scheduled(fixedDelay = 5000)
	public void doTask() {
		LOG.info("Time is: " + new Date());
	}
	
	
}
