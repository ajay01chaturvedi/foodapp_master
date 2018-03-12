package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_vendor")
public class Vendor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vendor_id")
	private String vendor_id;
	
	@Column(name="mobile_number")
	private String mobile_number;
	
	@Column(name="email_address")
	private String email_address;
	
	@Column(name="address")
	private String address;
	
	@Column(name="area_code")
	private String area_code;
	
	@Column(name="billing_type")
	private String billing_type;
	
	@Column(name="company_name")
	private String company_name;
	
	

	public String getVendor_id() {
		return vendor_id;
	}



	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getArea_code() {
		return area_code;
	}



	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}



	public String getBilling_type() {
		return billing_type;
	}



	public void setBilling_type(String billing_type) {
		this.billing_type = billing_type;
	}



	public String getCompany_name() {
		return company_name;
	}



	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
