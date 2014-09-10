package com.jeecms.bbs.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jeecms.bbs.manager.BbsForumMng;

public class BbsJob {
	private static final Logger log = LoggerFactory.getLogger(BbsJob.class);

	public void execute() {
		try {
			manager.updateAll_topic_today();
			log.info("update updateAll_topic_today success!");
		} catch (Exception e) {
			// TODO: handle exception
			log.info("update updateAll_topic_today fail!");
		}

	}

	@Autowired
	private BbsForumMng manager;

}