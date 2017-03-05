package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.apple.CommonRepository;
import com.dao.CommonDao;
import com.pojo.AppData;

@Component
public class CommonDaoImpl implements CommonDao {

	@Autowired
	private CommonRepository commonRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public AppData find(AppData appData) {
		return this.commonRepository.findOne("1");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AppData> findAll(AppData appData) {
		Criteria criteria = Criteria.where("firstName").is("Pradip");
		return (List<AppData>) mongoTemplate.find(Query.query(criteria), appData.getClass());
	}

	@Override
	public AppData add(AppData appData) {
		return this.commonRepository.insert(appData);
	}

	@Override
	public List<AppData> addAll(List<AppData> list) {
		return this.commonRepository.insert(list);
	}

	@Override
	public AppData update(AppData appData) {
		return this.commonRepository.save(appData);
	}

	@Override
	public List<AppData> updateAll(List<AppData> list) {
		return this.commonRepository.save(list);
	}

	@Override
	public void delete(AppData appData) {
		this.commonRepository.delete(appData);
	}

	@Override
	public void deleteAll(List<AppData> list) {
		this.commonRepository.delete(list);
	}

}
