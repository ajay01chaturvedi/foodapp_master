package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_summary")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private String order_id;
	
	@Column(name="order_date")
	private String order_date;
	
	@Column(name="order_day")
	private String order_day;
	
	@Column(name="order_type")
	private String order_type;
	
	@Column(name="address_type")
	private String address_type;
	
	@Column(name="status")
	private String status;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="subscription_id")
	private String subscription_id;
	
	@Column(name="vendor_id")
	private String vendor_id;

	@Column(name="customer_id")
	private String customer_id;
	
	

	public String getOrder_id() {
		return order_id;
	}



	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}



	public String getOrder_date() {
		return order_date;
	}



	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}



	public String getOrder_day() {
		return order_day;
	}



	public void setOrder_day(String order_day) {
		this.order_day = order_day;
	}



	public String getOrder_type() {
		return order_type;
	}



	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}



	public String getAddress_type() {
		return address_type;
	}



	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public String getSubscription_id() {
		return subscription_id;
	}



	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}



	public String getVendor_id() {
		return vendor_id;
	}



	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}



	public String getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
