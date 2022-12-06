package com.hackathon.dataprocess.scheduler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hackathon.dataprocess.module.Author;
import com.hackathon.dataprocess.repository.AuthorRepository;

@Component
public class Scheduler {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Scheduled(cron = "0 */1 * * * *")
	public void cronJobSch() throws Exception {
		
		System.out.println("Scheduler running "+new Date());
		List<Author> list = authorRepository.findAll();
		System.out.println("Scheduler running "+list.size());
		
	}
	

}
