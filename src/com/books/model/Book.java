package com.books.model;

public class Book {
	private String bkID;
	private String bkName;
	private String bkAuthor;
	private String bkPress;
	private Double bkPrice;
	private int bkState;

	//构造函数
	public String getbkID() {
		return bkID;
	}

	public void setbkID(String bkID) {
		this.bkID = bkID;
	}

	public String getbkName() {
		return bkName;
	}

	public void setbkName(String bkName) {
		this.bkName = bkName;
	}

	public String getbkAuthor() {
		return bkAuthor;
	}

	public void setbkAuthor(String bkAuthor) {
		this.bkAuthor = bkAuthor;
	}

	public String getbkPress() {
		return bkPress;
	}

	public void setbkPress(String bkPress) {
		this.bkPress = bkPress;
	}

	public Double getbkPrice() {
		return bkPrice;
	}

	public void setbkPrice(Double bkPrice) {
		this.bkPrice = bkPrice;
	}

	public int getbkState() {
		return bkState;
	}

	public void setbkState(int bkState) {
		this.bkState = bkState;
	}
}
