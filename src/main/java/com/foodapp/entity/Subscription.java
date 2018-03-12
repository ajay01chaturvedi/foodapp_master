package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subscription_id")
	private String subscription_id;
	
	@Column(name="subscription_type")
	private String subscription_type;
	
	@Column(name="valide_from")
	private String valide_from;
	
	@Column(name="valide_till")
	private String valide_till;
	
	@Column(name="menu_id")
	private String menu_id;
	
	@Column(name="address_ind_change")
	private String address_ind_change;
	
	@Column(name="vendor_id")
	private String vendor_id;
	
	

	public String getSubscription_id() {
		return subscription_id;
	}



	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}



	public String getSubscription_type() {
		return subscription_type;
	}



	public void setSubscription_type(String subscription_type) {
		this.subscription_type = subscription_type;
	}



	public String getValide_from() {
		return valide_from;
	}



	public void setValide_from(String valide_from) {
		this.valide_from = valide_from;
	}



	public String getValide_till() {
		return valide_till;
	}



	public void setValide_till(String valide_till) {
		this.valide_till = valide_till;
	}



	public String getMenu_id() {
		return menu_id;
	}



	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}



	public String getAddress_ind_change() {
		return address_ind_change;
	}



	public void setAddress_ind_change(String address_ind_change) {
		this.address_ind_change = address_ind_change;
	}



	public String getVendor_id() {
		return vendor_id;
	}



	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
