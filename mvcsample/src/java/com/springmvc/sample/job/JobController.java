package com.springmvc.sample.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobController {
	private final static Logger logger = LoggerFactory.getLogger(JobController.class);

	@Scheduled(cron = "2 14 11  * * ? ")
	public void batchTask() {
		logger.info("batchTask");
	}

	@Scheduled(cron = "0,5 14 11  * * ? ")
	public void batchTask1() {
		logger.info("batchTask11");
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("batchTask12");
	}

	public void batchQuartz1() {
		logger.info("batchQuartz1");
	}
}
