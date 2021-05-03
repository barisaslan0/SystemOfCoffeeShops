package Concrete;

import Abstract.CheckCustomerService;

public class CheckCustomerManager implements CheckCustomerService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
