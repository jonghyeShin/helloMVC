//고객들의 정보를 저장함.
//Customer은 고객의 정보를 저장하고있는 객체.(model-Customer)
//customers은 Customer객체를 저장하고 있는 HashMap. (1491019, 신종혜객체)

package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;
	
	public static final CustomerService instance = new CustomerService();
	
	public CustomerService(){
		customers = new HashMap<String, Customer>();
		
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer);
	}
	
	//맞으면 객체. 틀리면 null 리턴
	public Customer login(String id, String password){
		if(id!=null){
			Customer customer=instance.customers.get(id.toLowerCase());
			if(customer.getPassword().equals(password))
				return customer;
			else return null;
		}
		return null;
		
	}
}
