package com.foodapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodapp.entity.BillingSummary;
import com.foodapp.entity.Customer;
import com.foodapp.entity.Menu;
import com.foodapp.entity.Order;
import com.foodapp.entity.Subscription;
import com.foodapp.entity.Vendor;
import com.foodapp.service.ICustomerService;

@Controller
@RequestMapping("foodapp")
public class FoodAppController {

	@Autowired
	private ICustomerService customerSerive;
	
	@GetMapping("customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> list = customerSerive.getAllCustomers();
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@GetMapping("customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String customer_id) {
		Customer customer = customerSerive.getCustomerById(customer_id);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("menus")
	public ResponseEntity<List<Menu>> getAllMenus(){
		List<Menu> list = customerSerive.getAllMenus();
		return new ResponseEntity<List<Menu>>(list, HttpStatus.OK);
	}
	
	@GetMapping("menu/{id}")
	public ResponseEntity<Menu> getMenuById(@PathVariable("id") String menu_id) {
		Menu menu = customerSerive.getMenuById(menu_id);
		return new ResponseEntity<Menu>(menu, HttpStatus.OK);
	}
	
	@GetMapping("vendors")
	public ResponseEntity<List<Vendor>> getAllVendors(){
		List<Vendor> list = customerSerive.getAllVendors();
		return new ResponseEntity<List<Vendor>>(list, HttpStatus.OK);
	}
	
	@GetMapping("vendor/{id}")
	public ResponseEntity<Vendor> getVendorById(@PathVariable("id") String vendor_id) {
		Vendor vendor = customerSerive.getVendorById(vendor_id);
		return new ResponseEntity<Vendor>(vendor, HttpStatus.OK);
	}
	
	@GetMapping("transactions")
	public ResponseEntity<List<BillingSummary>> getAllBillingSummarys(){
		List<BillingSummary> list = customerSerive.getAllBillingSummarys();
		return new ResponseEntity<List<BillingSummary>>(list, HttpStatus.OK);
	}
	
	@GetMapping("transaction/{id}")
	public ResponseEntity<BillingSummary> getBillingSummaryById(@PathVariable("id") String transaction_reference_number) {
		BillingSummary vendor = customerSerive.getBillingSummaryById(transaction_reference_number);
		return new ResponseEntity<BillingSummary>(vendor, HttpStatus.OK);
	}
	
	@GetMapping("orders")
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> list = customerSerive.getAllOrders();
		return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
	}
	
	@GetMapping("order/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("id") String order_id) {
		Order order = customerSerive.getOrderById(order_id);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	@GetMapping("subscriptions")
	public ResponseEntity<List<Subscription>> getAllSubscriptions(){
		List<Subscription> list = customerSerive.getAllSubscriptions();
		return new ResponseEntity<List<Subscription>>(list, HttpStatus.OK);
	}
	
	@GetMapping("subscription/{id}")
	public ResponseEntity<Subscription> getSubscriptionById(@PathVariable("id") String subscription_id) {
		Subscription subscription = customerSerive.getSubscriptionById(subscription_id);
		return new ResponseEntity<Subscription>(subscription, HttpStatus.OK);
	}
}
