package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.apple.CommonRepository;
import com.dao.impl.CommonDaoImpl;
import com.pojo.AppData;
import com.pojo.Customer;
import com.service.CommonService;
import com.service.impl.CommonServiceImpl;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { CommonServiceImpl.class, CommonDaoImpl.class,
		CommonRepository.class })
public class CustomerControllerTest extends TestCase {

	@Autowired
	private CommonService commonService;

	@Test
	public void testAddAllCustomer() {
		List<AppData> list = new ArrayList<AppData>();
		for (int i = 1; i < 10; i++) {
			Customer customer = new Customer();
			customer.setFirstName("Pradip");
			customer.setLastName("Patil : " + i);
			list.add(customer);
		}
		commonService.addAll(list);
	}
}
