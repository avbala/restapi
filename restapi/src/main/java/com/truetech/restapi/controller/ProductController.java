package com.truetech.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import com.truetech.restapi.Exception.ResourceNotFoundException;
import com.truetech.restapi.model.Config;
import com.truetech.restapi.model.Product;
import com.truetech.restapi.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@Autowired
	 Config config;
	
	/*
	 * 
	 *  This function  call the service function and return the product detailse
	 */
	
	@GetMapping("/getproductdetails")
	public List<Product> getProductDetails() 
	{
		try
		{
			return productservice.getProductDetails();
		}
		catch(Exception ex)
		{
			throw new ResourceNotFoundException();
		}
	}
	
	/*
	 * 
	 *  This function  returns the configuration detailse sent to client
	 */
	
	@GetMapping("/getconfigdetails")
	public Config getConfigDetails()
	{
		try
		{
			return config;
		}
		catch(Exception ex)
		{
			throw new ResourceNotFoundException();
		}
		
	}


}
