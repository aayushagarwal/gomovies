package com.snap.entity;

public class User {

	private int id;
	private String name;
	private int walletAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(int walletAmount) {
		this.walletAmount = walletAmount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String name, int walletAmount, String password) {
		super();
		this.id = id;
		this.name = name;
		this.walletAmount = walletAmount;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String password;

}
