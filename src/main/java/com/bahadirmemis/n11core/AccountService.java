package com.bahadirmemis.n11core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bahadirmemis
 */
@Component
@Scope("prototype")
public class AccountService {

  private AccountDao accountDao;

  public AccountService(AccountDao accountDao) {
    this.accountDao = accountDao;
  }

  public AccountDao getAccountDao() {
    return accountDao;
  }
}
