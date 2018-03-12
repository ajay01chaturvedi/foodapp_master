package com.foodapp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.foodapp.entity.BillingSummary;
import com.foodapp.entity.Customer;
import com.foodapp.entity.Menu;
import com.foodapp.entity.Order;
import com.foodapp.entity.Subscription;
import com.foodapp.entity.Vendor;

@Transactional
@Repository
public class CustomerDAO implements ICustomerDAO{
	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		String hql = "FROM Customer as app_cust ORDER BY app_cust.customer_id";
		return (List<Customer>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Customer getCustomerById(String customer_id) {
		return entityManager.find(Customer.class, customer_id);
	}
	
	@Override
	public List<Menu> getAllMenus() {
		String hql = "FROM Menu as app_menu ORDER BY app_menu.menu_id";
		return (List<Menu>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Menu getMenuById(String menu_id) {
		return entityManager.find(Menu.class, menu_id);
	}
	
	@Override
	public List<Vendor> getAllVendors() {
		String hql = "FROM Vendor as app_vendor ORDER BY app_vendor.vendor_id";
		return (List<Vendor>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Vendor getVendorById(String vendor_id) {
		return entityManager.find(Vendor.class, vendor_id);
	}
	
	@Override
	public List<BillingSummary> getAllBillingSummarys() {
		String hql = "FROM BillingSummary as app_billing_summary ORDER BY app_billing_summary.transaction_reference_number";
		return (List<BillingSummary>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public BillingSummary getBillingSummaryById(String transaction_reference_number) {
		return entityManager.find(BillingSummary.class, transaction_reference_number);
	}
	
	@Override
	public List<Order> getAllOrders() {
		String hql = "FROM Order as app_order ORDER BY app_order.order_id";
		return (List<Order>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Order getOrderById(String order_id) {
		return entityManager.find(Order.class, order_id);
	}
	
	@Override
	public List<Subscription> getAllSubscriptions() {
		String hql = "FROM Subscription as app_subscription ORDER BY app_subscription.subscription_id";
		return (List<Subscription>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public Subscription getSubscriptionById(String subscription_id) {
		return entityManager.find(Subscription.class, subscription_id);
	}
}
