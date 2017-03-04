package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dao.CommonDao;
import com.pojo.AppData;
import com.pojo.Greeting;

@Component
public class CommonDaoImpl implements CommonDao {

	@Override
	public List<AppData> findAll() {
		List<AppData> list = new ArrayList<AppData>();
		for (int i = 1; i < 10; i++) {
			AppData appData = new Greeting(i, "Pradip - " + i);
			list.add(appData);
		}
		return list;
	}

	@Override
	public AppData find(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppData add(AppData appData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppData update(AppData appData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(AppData appData) {
		// TODO Auto-generated method stub

	}

}
