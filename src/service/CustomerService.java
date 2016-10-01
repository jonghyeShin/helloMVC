//고객들의 정보를 저장함.
//Customer은 고객의 정보를 저장하고있는 객체.(model-Customer)
//customers은 Customer객체를 저장하고 있는 HashMap. (1491019, 신종혜객체)

package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;
	
	public CustomerService(){
		customers = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001","Alice","alice@hansung.ac.kr"));
		addCustomer(new Customer("id002","Bob","bob@hansung.ac.kr"));
		addCustomer(new Customer("id003","Charlie","charlie@hansung.ac.kr"));
		addCustomer(new Customer("id004","David","david@hansung.ac.kr"));
		addCustomer(new Customer("id005","Trudy","trudy@hansung.ac.kr"));
		
	}
	
	//여기서의 customer의 Customer 객체.
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer);
	}
	
	//customers HashMap에서 id를 이용하여 고객 객체를 찾아서 반환.
	public Customer findCustomer(String id){
		if(id!=null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}
}
