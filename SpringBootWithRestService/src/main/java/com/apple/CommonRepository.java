package com.apple;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.pojo.AppData;

@Component
public interface CommonRepository extends MongoRepository<AppData, String> {

}
