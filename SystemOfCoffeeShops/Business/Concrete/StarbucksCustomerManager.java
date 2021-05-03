package Concrete;

import Abstract.CheckCustomerService;
import Abstract.CustomerManager;
import Concrete.Customer;

public class StarbucksCustomerManager extends CustomerManager {
	private CheckCustomerService checkCustomerService;

	public StarbucksCustomerManager(CheckCustomerService checkCustomerService) {
		this.checkCustomerService = checkCustomerService;
	}

	@Override
	public void add(Customer customer) {
		if (checkCustomerService.CheckIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Giriþ doðrulanamadý!");
		}
		
	}
}
