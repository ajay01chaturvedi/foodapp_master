package com.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.dao.ICustomerDAO;
import com.foodapp.entity.BillingSummary;
import com.foodapp.entity.Customer;
import com.foodapp.entity.Menu;
import com.foodapp.entity.Order;
import com.foodapp.entity.Subscription;
import com.foodapp.entity.Vendor;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerDAO customerDAO;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(String customer_id) {
		Customer obj = customerDAO.getCustomerById(customer_id);
		return obj;
	}
	
	@Override
	public List<Menu> getAllMenus() {
		return customerDAO.getAllMenus();
	}

	@Override
	public Menu getMenuById(String menu_id) {
		Menu obj = customerDAO.getMenuById(menu_id);
		return obj;
	}
	
	@Override
	public List<Vendor> getAllVendors() {
		return customerDAO.getAllVendors();
	}

	@Override
	public Vendor getVendorById(String vendor_id) {
		Vendor obj = customerDAO.getVendorById(vendor_id);
		return obj;
	}
	
	@Override
	public List<BillingSummary> getAllBillingSummarys() {
		return customerDAO.getAllBillingSummarys();
	}

	@Override
	public BillingSummary getBillingSummaryById(String transaction_reference_number) {
		BillingSummary obj = customerDAO.getBillingSummaryById(transaction_reference_number);
		return obj;
	}
	
	@Override
	public  List<Order> getAllOrders() {
		return customerDAO.getAllOrders();
	}

	@Override
	public Order getOrderById(String order_id) {
		Order obj = customerDAO.getOrderById(order_id);
		return obj;
	}
	
	@Override
	public  List<Subscription> getAllSubscriptions() {
		return customerDAO.getAllSubscriptions();
	}

	@Override
	public Subscription getSubscriptionById(String subscription_id) {
		Subscription obj = customerDAO.getSubscriptionById(subscription_id);
		return obj;
	}
}
