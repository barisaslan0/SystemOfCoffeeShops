package Abstract;

import Concrete.Customer;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("M��teri ba�ar�yla eklendi: " + customer.getFirstName() +" "+ customer.getLastName());
	}
}
