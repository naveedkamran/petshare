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
public class PetService {

    private static final PetService instance = new PetService();

    public static PetService getInstance() {
        return instance;
    }

    public void create(Map map) {
        BasicDBObject document = new BasicDBObject();
        MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_pet).insertOne(new Document(map));
    }

    public Document read(String id) {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_pet).find(
                new BasicDBObject().append("_id", id)).first();
    }

    public FindIterable<Document> list() {
        return MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_pet).find();
    }

    public void update(Document docOld, Document docNew) {
        MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_pet).updateOne(docOld, docNew);
    }

    public void delete(String id) {
        MongoDbUtil.getInstance().getMongoDatabase().getCollection(Constants.table_name_pet).deleteOne(
                new BasicDBObject().append("_id", id));
    }
}
