package ConsoleUI;

import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.CyclicBarrier;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.Customer;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		CustomerManager customerManager2 = new NeroCustomerManager();

		Customer customer = new Customer(1, "1234567890", "Barýþ", "Aslan", LocalDate.of(2000, 3, 2));

		customerManager.add(customer);
		customerManager2.add(customer);

	}

}
