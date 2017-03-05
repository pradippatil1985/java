package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.AppData;
import com.pojo.Customer;
import com.service.CommonService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CommonService commonService;
	
	@RequestMapping(path = "/addAll")
	public List<AppData> addAll() {
		List<AppData> list = new ArrayList<AppData>();
		for (int i = 1; i < 10; i++) {
			Customer customer = new Customer();
			customer.setFirstName("Pradip");
			customer.setLastName("Patil : " + i);
			list.add(customer);
		}
		return this.commonService.addAll(list);
	}
	
	@RequestMapping(path = "/findAll")
	public List<AppData> findAll() {
		List<AppData> list = new ArrayList<AppData>();
		for (int i = 1; i < 10; i++) {
			Customer customer = new Customer();
			customer.setFirstName("Pradip");
			customer.setLastName("Patil : " + i);
			list.add(customer);
		}
		return this.commonService.findAll(new Customer());
	}

//	@RequestMapping(path = "/add", method = RequestMethod.POST, consumes = "application/json")
//	@ResponseStatus(HttpStatus.CREATED)
//	public Customer addCustomer(@RequestBody @Valid Customer customer) {
//		return (Customer) this.commonService.add(customer);
//	}

//	public List<?> findAll() {
//		AppData appData = new Customer();
//		return this.commonService.findAll(appData);
//	}

}
