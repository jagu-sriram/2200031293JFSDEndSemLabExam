package com.exam.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.jfsd.springboot.service.APIService;

@RestController
public class Controller {
	
	@Autowired
	private APIService apiService;
	
	@GetMapping("getAllProducts")
	public List<Object> getAllProducts()
	{
		return apiService.getAllProducts();
	}
}
