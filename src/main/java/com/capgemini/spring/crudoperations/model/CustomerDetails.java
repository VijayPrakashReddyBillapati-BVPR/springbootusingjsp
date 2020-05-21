package com.capgemini.spring.crudoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CustomerDetails")
public class CustomerDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="accountNo")
	private long accountNo;
	private String name;
	private String emailId;
	private String password;
	private String pancardNo;
	private String address;
	private Integer mobileNo;
	private double balance;
	
	public CustomerDetails(String name, String emailId, String password, String pancardNo,
			String address, Integer mobileNo, double balance) {
		
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.pancardNo = pancardNo;
		this.address = address;
		this.mobileNo = mobileNo;
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public CustomerDetails() {
		
	}
	@Override
	public String toString() {
		return "CustomerDetails [accountNo=" + accountNo + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", pancardNo=" + pancardNo + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", balance=" + balance + "]";
	}
	
	
	
}
