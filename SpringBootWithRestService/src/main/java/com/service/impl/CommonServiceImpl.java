package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.CommonDao;
import com.pojo.AppData;
import com.service.CommonService;

@Component
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CommonDao commonDao;

	@Override
	public List<AppData> findAll() {
		return this.commonDao.findAll();
	}

	@Override
	public AppData find(int key) {
		return this.commonDao.find(key);
	}

	@Override
	public AppData add(AppData appData) {
		return this.commonDao.add(appData);
	}

	@Override
	public AppData update(AppData appData) {
		return this.commonDao.update(appData);
	}

	@Override
	public void delete(AppData appData) {
		this.commonDao.delete(appData);
	}

}
