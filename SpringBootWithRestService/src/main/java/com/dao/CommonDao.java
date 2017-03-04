package com.dao;

import java.util.List;

import com.pojo.AppData;

public interface CommonDao {
	public List<AppData> findAll();
	public AppData find(int key);
	public AppData add(AppData appData);
	public AppData update(AppData appData);
	public void delete(AppData appData);
}
