package com.webservices.app.service;

import org.springframework.stereotype.Service;

import com.webservices.app.request.RequestBody;
import com.webservices.app.response.ResponseBody;

@Service
public class ServiceImplClass implements ServiceInterface{
	
	@Override
	public ResponseBody print(RequestBody request) {
		
		ResponseBody n = new ResponseBody();
		n.setCity(request.getCity());	
		n.setId(request.getId());
		n.setName(request.getName());
		return n;
	}
	
	@Override
	public ResponseBody getCity(String id) {
		
		ResponseBody n = new ResponseBody();
		RequestBody request = new RequestBody();
		request.setCity(id);
		n.setCity(request.getCity());	
		n.setId(request.getId());
		n.setName(request.getName());
		return n;
	}
}
