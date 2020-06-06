package com.truetech.restapi.model;

public class Product {

	int productid;
	String productname;
	String productdesc;
	String upc;
	String sku;
	double rate;
	double mrp;
	public Product(int productid,String productname,String productdesc,String upc,String sku,double rate,double mrp)
	{
		this.productid=productid;
		this.productname=productname;
		this.productdesc=productdesc;
		this.upc=upc;
		this.sku=sku;
		this.rate=rate;
		this.mrp=mrp;
		
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	
	
}
