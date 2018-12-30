package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="product_buy")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	@Column
	private String vendor_name;
	@Column
	private String batch;
	@Column
	private int milk_quaintly;
	@Column
	private int fat;
	@Column
	private int rate_of_fat;
	@Column
	private int per_liter;
	@Column
	private int total;
	@Column
	private int advanced;
	@Column
	private int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getMilk_quaintly() {
		return milk_quaintly;
	}
	public void setMilk_quaintly(int milk_quaintly) {
		this.milk_quaintly = milk_quaintly;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getRate_of_fat() {
		return rate_of_fat;
	}
	public void setRate_of_fat(int rate_of_fat) {
		this.rate_of_fat = rate_of_fat;
	}
	public int getPer_liter() {
		return per_liter;
	}
	public void setPer_liter(int per_liter) {
		this.per_liter = per_liter;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAdvanced() {
		return advanced;
	}
	public void setAdvanced(int advanced) {
		this.advanced = advanced;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	 
	
	
	
	

}
