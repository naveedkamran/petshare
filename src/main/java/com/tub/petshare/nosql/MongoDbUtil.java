package com.tub.petshare.nosql;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author naveed
 */
public class MongoDbUtil {

    private static MongoDbUtil mongoService = null;

    public static final MongoDbUtil getInstance() {
        if (mongoService == null) {
            mongoService = new MongoDbUtil();
        }

        return mongoService;
    }

    public MongoDatabase getMongoDatabase() {
        //MongoClient mongoClient = new MongoClient("52.212.71.172", 27017);
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase database = mongoClient.getDatabase("petsharedb");

        return database;

    }
}
