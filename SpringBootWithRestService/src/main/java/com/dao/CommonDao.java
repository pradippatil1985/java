package com.dao;

import java.util.List;

import com.pojo.AppData;

public interface CommonDao {

	public AppData find(AppData appData);

	public List<AppData> findAll(AppData appData);

	public AppData add(AppData appData);

	public List<AppData> addAll(List<AppData> list);

	public AppData update(AppData appData);

	public List<AppData> updateAll(List<AppData> list);

	public void delete(AppData appData);

	public void deleteAll(List<AppData> list);
	
}
