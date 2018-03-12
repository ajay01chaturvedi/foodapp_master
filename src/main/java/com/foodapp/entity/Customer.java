package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_customer")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private String customer_id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="mobile_number")
	private String mobile_number;
	
	@Column(name="email_address")
	private String email_address;
	
	@Column(name="primary_address")
	private String primary_address;
	
	@Column(name="secondary_address")
	private String secondary_address;
	
	@Column(name="billing_type")
	private String billing_type;
	
	@Column(name="area_code")
	private String area_code;
	
	@Column(name="subscription_id")
	private String subscription_id;

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPrimary_address() {
		return primary_address;
	}

	public void setPrimary_address(String primary_address) {
		this.primary_address = primary_address;
	}

	public String getSecondary_address() {
		return secondary_address;
	}

	public void setSecondary_address(String secondary_address) {
		this.secondary_address = secondary_address;
	}

	public String getBilling_type() {
		return billing_type;
	}

	public void setBilling_type(String billing_type) {
		this.billing_type = billing_type;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
