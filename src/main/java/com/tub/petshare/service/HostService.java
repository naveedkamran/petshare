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
public class HostService {

    private static final HostService instance = new HostService();

    public static HostService getInstance() {
        return instance;
    }

    public void create(Map map) {
        BasicDBObject document = new BasicDBObject();
        MongoDbUtil.getInstance().getMongoDatabase().getCollection("hosts").insertOne(new Document(map));
    }

    public Document read(String id) {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection("hosts").find(
                new BasicDBObject().append("_id", id)).first();
    }

    public FindIterable<Document> list() {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection("hosts").find();
    }

    public String update(Map map) {
        return null;
    }

    public void delete(String id) {
        MongoDbUtil.getInstance().getMongoDatabase().getCollection("hosts").deleteOne(
                new BasicDBObject().append("_id", id));
    }
}
