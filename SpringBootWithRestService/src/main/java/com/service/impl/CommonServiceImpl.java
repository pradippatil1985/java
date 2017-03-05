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
	public AppData find(AppData appData) {
		return this.commonDao.find(appData);
	}

	@Override
	public List<AppData> findAll(AppData appData) {
		return this.commonDao.findAll(appData);
	}

	@Override
	public AppData add(AppData appData) {
		return this.commonDao.add(appData);
	}

	@Override
	public List<AppData> addAll(List<AppData> list) {
		return this.commonDao.addAll(list);
	}

	@Override
	public AppData update(AppData appData) {
		return this.commonDao.update(appData);
	}

	@Override
	public List<AppData> updateAll(List<AppData> list) {
		return this.commonDao.updateAll(list);
	}

	@Override
	public void delete(AppData appData) {
		this.commonDao.delete(appData);
	}

	@Override
	public void deleteAll(List<AppData> list) {
		this.commonDao.deleteAll(list);
	}


}
