package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billing_summary")
public class BillingSummary implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_reference_number")
	private String transaction_reference_number;
	
	@Column(name="billing_type")
	private String billing_type;
	
	@Column(name="food_unit_count")
	private int food_unit_count;
	
	@Column(name="food_unit_rate")
	private int food_unit_rate;
	
	@Column(name="discount_id")
	private String discount_id;
	
	@Column(name="total_amount")
	private int total_amount;
	
	@Column(name="billing_date")
	private String billing_date;
	
	@Column(name="status")
	private String status;
	
	@Column(name="billing_against_customer")
	private String billing_against_customer;

	@Column(name="subscription_id")
	private String subscription_id;
	
	@Column(name="billing_against_vendor")
	private String billing_against_vendor;
	


	public String getTransaction_reference_number() {
		return transaction_reference_number;
	}





	public void setTransaction_reference_number(String transaction_reference_number) {
		this.transaction_reference_number = transaction_reference_number;
	}





	public String getBilling_type() {
		return billing_type;
	}





	public void setBilling_type(String billing_type) {
		this.billing_type = billing_type;
	}





	public int getFood_unit_count() {
		return food_unit_count;
	}





	public void setFood_unit_count(int food_unit_count) {
		this.food_unit_count = food_unit_count;
	}





	public int getFood_unit_rate() {
		return food_unit_rate;
	}





	public void setFood_unit_rate(int food_unit_rate) {
		this.food_unit_rate = food_unit_rate;
	}





	public String getDiscount_id() {
		return discount_id;
	}





	public void setDiscount_id(String discount_id) {
		this.discount_id = discount_id;
	}





	public int getTotal_amount() {
		return total_amount;
	}





	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}





	public String getBilling_date() {
		return billing_date;
	}





	public void setBilling_date(String billing_date) {
		this.billing_date = billing_date;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public String getBilling_against_customer() {
		return billing_against_customer;
	}





	public void setBilling_against_customer(String billing_against_customer) {
		this.billing_against_customer = billing_against_customer;
	}





	public String getSubscription_id() {
		return subscription_id;
	}





	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}





	public String getBilling_against_vendor() {
		return billing_against_vendor;
	}





	public void setBilling_against_vendor(String billing_against_vendor) {
		this.billing_against_vendor = billing_against_vendor;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
