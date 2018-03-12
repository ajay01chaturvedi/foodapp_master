package com.foodapp.dao;

import java.util.List;

import com.foodapp.entity.BillingSummary;
import com.foodapp.entity.Customer;
import com.foodapp.entity.Menu;
import com.foodapp.entity.Order;
import com.foodapp.entity.Subscription;
import com.foodapp.entity.Vendor;

public interface ICustomerDAO {
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(String customer_id);
	
	List<Menu> getAllMenus();
	
	Menu getMenuById(String menu_id);
	
	List<Vendor> getAllVendors();
	
	Vendor getVendorById(String vendor_id);
	
	List<BillingSummary> getAllBillingSummarys();
	
	BillingSummary getBillingSummaryById(String transaction_reference_number);
	
	List<Order> getAllOrders();
	
	Order getOrderById(String order_id);
	
	List<Subscription> getAllSubscriptions();
	
	Subscription getSubscriptionById(String subscription_id);
}
