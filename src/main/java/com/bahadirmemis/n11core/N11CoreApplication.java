package com.bahadirmemis.n11core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class N11CoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(N11CoreApplication.class, args);

		AccountDao accountDao1 = applicationContext.getBean(AccountDao.class);
		AccountDao accountDao2 = applicationContext.getBean(AccountDao.class);
		AccountDao accountDao3 = applicationContext.getBean(AccountDao.class);

		AccountService accountService1 = applicationContext.getBean(AccountService.class);
		AccountService accountService2 = applicationContext.getBean(AccountService.class);
		AccountService accountService3 = applicationContext.getBean(AccountService.class);

		System.out.println(accountDao1 == accountDao2);
		System.out.println(accountService1 == accountService2);
		System.out.println(accountService1.getAccountDao() == accountService2.getAccountDao());

	}

}
