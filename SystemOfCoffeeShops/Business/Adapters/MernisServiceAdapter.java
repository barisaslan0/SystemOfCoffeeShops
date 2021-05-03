package Adapters;

import java.rmi.RemoteException;

import Abstract.CheckCustomerService;
import Concrete.Customer;
import MernisService.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CheckCustomerService {

	@Override
	public boolean CheckIfRealPerson(Customer customer){
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			return proxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getBirthDate().getYear()
					);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
