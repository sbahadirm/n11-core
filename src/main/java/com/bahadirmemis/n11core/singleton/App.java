package com.bahadirmemis.n11core.singleton;

/**
 * @author bahadirmemis
 */
public class App {

  public static void main(String[] args) {

    CustomerService customerService1 = CustomerService.initCustomerService();
    CustomerService customerService2 = CustomerService.initCustomerService();
    CustomerService customerService3 = CustomerService.initCustomerService();
    CustomerService customerService4 = CustomerService.initCustomerService();
    CustomerService customerService5 = CustomerService.initCustomerService();
    CustomerService customerService6 = CustomerService.initCustomerService();
    CustomerService customerService7 = CustomerService.initCustomerService();
    CustomerService customerService8 = CustomerService.initCustomerService();
    CustomerService customerService9 = CustomerService.initCustomerService();

  }
}
