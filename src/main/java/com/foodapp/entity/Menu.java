package com.foodapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_menu")
public class Menu implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="menu_id")
	private String menu_id;
	
	@Column(name="vendor_id")
	private String vendor_id;
	
	@Column(name="daal")
	private String daal;
	
	@Column(name="chapati")
	private String chapati;
	
	@Column(name="rice")
	private String rice;
	
	@Column(name="curry1")
	private String curry1;
	
	@Column(name="curry2")
	private String curry2;
	
	@Column(name="curry3")
	private String curry3;
	
	@Column(name="sweet")
	private String sweet;

	@Column(name="salad")
	private String salad;
	
	@Column(name="papad")
	private String papad;
	
	@Column(name="date_applicable")
	private String date_applicable;
	
	@Column(name="meal_type")
	private String meal_type;

	public String getDate_applicable() {
		return date_applicable;
	}



	public void setDate_applicable(String date_applicable) {
		this.date_applicable = date_applicable;
	}



	public String getMeal_type() {
		return meal_type;
	}



	public void setMeal_type(String meal_type) {
		this.meal_type = meal_type;
	}



	public String getMenu_id() {
		return menu_id;
	}



	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}



	public String getVendor_id() {
		return vendor_id;
	}



	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}



	public String getDaal() {
		return daal;
	}



	public void setDaal(String daal) {
		this.daal = daal;
	}



	public String getChapati() {
		return chapati;
	}



	public void setChapati(String chapati) {
		this.chapati = chapati;
	}



	public String getRice() {
		return rice;
	}



	public void setRice(String rice) {
		this.rice = rice;
	}



	public String getCurry1() {
		return curry1;
	}



	public void setCurry1(String curry1) {
		this.curry1 = curry1;
	}



	public String getCurry2() {
		return curry2;
	}



	public void setCurry2(String curry2) {
		this.curry2 = curry2;
	}



	public String getCurry3() {
		return curry3;
	}



	public void setCurry3(String curry3) {
		this.curry3 = curry3;
	}



	public String getSweet() {
		return sweet;
	}



	public void setSweet(String sweet) {
		this.sweet = sweet;
	}



	public String getSalad() {
		return salad;
	}



	public void setSalad(String salad) {
		this.salad = salad;
	}



	public String getPapad() {
		return papad;
	}



	public void setPapad(String papad) {
		this.papad = papad;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
