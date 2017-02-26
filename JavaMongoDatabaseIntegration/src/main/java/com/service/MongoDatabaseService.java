package com.service;

import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDatabaseService {

	/**** Connect to MongoDB ****/
	// Since 2.10.0, uses MongoClient
	private MongoClient mongoClient = null;

	/**** Get database ****/
	// if database doesn't exists, MongoDB will create it for you
	private DB db = null;

	private MongoDatabase mongoDatabase = null;

	/**** Get collection / table from 'testdb' ****/
	// if collection doesn't exists, MongoDB will create it for you
	private DBCollection table = null;

	MongoCollection<Document> mongoCollection = null;

	private static final String DATABASE_HOST = "localhost";
	private static final String DATABASE_NAME = "testdb";
	private static final String DATABASE_TABLE_USER = "user";

	@SuppressWarnings("deprecation")
	public MongoDatabaseService() {
		this.mongoClient = new MongoClient(DATABASE_HOST, 27017);

		this.db = mongoClient.getDB(DATABASE_NAME);

		this.mongoDatabase = this.mongoClient.getDatabase(DATABASE_NAME);
		this.mongoCollection = this.mongoDatabase.getCollection(DATABASE_TABLE_USER);

		this.table = db.getCollection(DATABASE_TABLE_USER);
	}

	public void insert(Document document) {
		BasicDBObject baseDocument = new BasicDBObject();
		for (Map.Entry<String, ?> entry : document.entrySet()) {
			baseDocument.put(entry.getKey(), entry.getValue());
		}
		this.table.insert(baseDocument);
		this.mongoCollection.insertOne(document);
	}

	public void find() {
		Bson filter = new Document("name", "Pradip");
		FindIterable<?> findIterable = this.mongoCollection.find(filter);
		while (findIterable.iterator().hasNext()) {
			System.out.println(findIterable.iterator().next());
		}
	}

	public void find(BasicDBObject searchQuery) {
		DBCursor cursor = this.table.find(searchQuery);
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}

	public void update(BasicDBObject query, BasicDBObject newDocument) {
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);
		this.table.update(query, updateObj);
	}

	public void delete() {

	}

}