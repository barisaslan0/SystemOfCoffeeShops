package Abstract;

import Concrete.Customer;

public interface CheckCustomerService {
	boolean CheckIfRealPerson(Customer customer);
}
