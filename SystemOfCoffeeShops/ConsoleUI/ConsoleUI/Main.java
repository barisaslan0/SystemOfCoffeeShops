package ConsoleUI;

import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.CyclicBarrier;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.Customer;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "20110795948", "Barýþ", "Aslan", LocalDate.of(2000, 3, 2));
		customerManager.add(customer);

	}

}
