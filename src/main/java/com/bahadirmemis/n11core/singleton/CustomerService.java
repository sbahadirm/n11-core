package com.bahadirmemis.n11core.singleton;

/**
 * @author bahadirmemis
 */
public class CustomerService {

  private static CustomerService customerService = new CustomerService();

  private CustomerService() {
    System.out.println("oluştu");
  }

  public static CustomerService initCustomerService(){
    return customerService;
  }
}
