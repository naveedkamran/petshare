package com.tub.petshare.service;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.tub.petshare.nosql.MongoDbUtil;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author naveed
 */
public class UserAccountService {

    private static final UserAccountService instance = new UserAccountService();

    public static UserAccountService getInstance() {
        return instance;
    }

    public void create(Map map) {
        BasicDBObject document = new BasicDBObject();
        MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).insertOne(new Document(map));
    }

    public Document read(String id) {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).find(
                new BasicDBObject().append("_id", id)).first();
    }

    public Document readByUsername(String username) {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).find(
                new BasicDBObject().append("username", username)).first();
    }

    public Document readByUsernameAndPass(String username, String password) {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).find(
                new BasicDBObject().append("username", username).append("password", password)).first();
    }

    public FindIterable<Document> list() {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).find();
    }

    public String update(Map map) {
        return null;
    }

    public void delete(String id) {
        MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_user).deleteOne(
                new BasicDBObject().append("_id", id));
    }
}
