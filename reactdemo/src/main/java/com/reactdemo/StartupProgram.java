package com.reactdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.reactdemo.model.Account;
import com.reactdemo.repository.ReactiveAccountRepository;

@Component
public class StartupProgram implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	ReactiveAccountRepository accountRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("im method run()");
		Account account = new Account("divine","SA","cdivine304@live.com");
		accountRepository.save(account).block();
		logger.info("accountRepository count {} ",accountRepository.count().block());
	}

}
