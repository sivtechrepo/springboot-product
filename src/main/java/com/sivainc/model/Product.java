package com.sivainc.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Product {
	@Id
	private Integer id;
	private String prodcutName;
	private Float productPrice;
	private String manufacturer;
	private Date mfgDate;
	
	public Product(Integer id, String prodcutName, Float productPrice, String manufacturer, Date mfgDate) {
		super();
		this.id = id;
		this.prodcutName = prodcutName;
		this.productPrice = productPrice;
		this.manufacturer = manufacturer;
		this.mfgDate = mfgDate;
	}
	public Product() {
 	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdcutName() {
		return prodcutName;
	}
	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	

}
