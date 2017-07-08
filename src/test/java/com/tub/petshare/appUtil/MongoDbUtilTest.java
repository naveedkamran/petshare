package com.tub.petshare.appUtil;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.datenc.commons.nosql.mongo.MongoConnectionUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/datenc-applicationcontext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class MongoDbUtilTest {

    @Test
    public void insertGood001() {
        try {

            DBCollection coll = MongoConnectionUtil.getInstance().getDB().getCollection("testCollection");

            BasicDBObject doc = new BasicDBObject("name", "MongoDB")
                    .append("type", "database")
                    .append("count", 1)
                    .append("info", new BasicDBObject("x", 203).append("y", 102));
            coll.insert(doc);

            DBObject myDoc = coll.findOne();
            System.out.println(myDoc);

            System.out.println("Program completed.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static void main(String args[]) {

    }

}
