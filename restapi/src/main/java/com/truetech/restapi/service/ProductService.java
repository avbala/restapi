package com.truetech.restapi.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.truetech.restapi.model.Product;

@Service
public class ProductService {

	
	
	public List<Product> getProductDetails()
	{
		return addProductList();
	}
	/*
	 *  This function returns static data.When user send the product request to restapi application, it send the response to client as  json format
	 * 
	 */
	public List<Product> addProductList()
	{
		int count=0;
		Product product1 = new Product(++count,"Phone Lenses","Phone Lenses  apple","A111","Z111", 700.00,900.00);
		Product product2 = new Product(++count,"Wifi Repeater","Wifi Repeater Home","B211","Y111", 2500.00,3000.00);
		Product product3 = new Product(++count,"Face Shieldr","Face Shield","C311","X111", 1500.00,2000.00);
		Product product4 = new Product(++count,"Drone Camera","Wifi Repeater Home","D411","W111", 10000.00,12000.00);
		Product product5 = new Product(++count,"Cat Massage Comb","Cat Massage Comb","E211","V111", 400.00,500.00);
		List<Product> products = Arrays.asList(product1,product2,product3,product4,product5);
	    return products;
	}
	
}
