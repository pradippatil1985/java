package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.CommonService;

@RestController
public class CommonController {

	@Autowired
	private CommonService commonService;

	@GetMapping("/customers")
	public List<?> findAll() {
		return this.commonService.findAll();
	}

}
