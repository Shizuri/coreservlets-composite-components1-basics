package exercisesPackage;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="customerc")
public class CustomerController {

	private Customer customer = new Customer("10", "Pero", "Perovski", 200.13);
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerController() {
		customerList.add(new Customer("20", "Miro", "Mirov", 1000));
		customer.setImage("nature1.jpg");
		customerList.get(0).setImage("nature2.jpg");
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
