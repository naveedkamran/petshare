package com.tub.petshare.nosql;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;

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
        MongoCredential credential = MongoCredential.createCredential("naveed", "petsharedb", "Demo123User456".toCharArray());
        MongoClient mongoClient = new MongoClient(new ServerAddress("34.249.31.106", 27017), Arrays.asList(credential));

//        MongoClient mongoClient = new MongoClient("52.212.71.172", 27017);
        //MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("petsharedb");

        return database;

    }
}
