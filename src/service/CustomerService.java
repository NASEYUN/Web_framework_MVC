package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap;
	
	public CustomerService() {
		customerMap = new HashMap<String, Customer> (); 
		
		addCustomer(new Customer("nsy", "seyun"));
		addCustomer(new Customer("nsy0512", "seyun"));
		addCustomer(new Customer("kkh0216", "kyeongho"));
		
	}

	private void addCustomer(Customer customer) {
		customerMap.put(customer.getUser_id(), customer);
	}
	
	public Customer findCustomer(String user_id) {
		
		if(user_id != null)  
			return(customerMap.get(user_id.toLowerCase()));
		else 
			return null;
	}
	
	public List<Customer> getAllCustomers() {
		
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		return customerList;
	}
}
