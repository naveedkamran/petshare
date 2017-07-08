package com.tub.petshare.apputil;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.datenc.commons.exception.DALException;
import com.datenc.commons.nosql.mongo.MongoConnectionUtil;
import com.tub.petshare.enums.BoType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Naveed Kamran
 */
public class MongoService {

    private static final MongoService instance = new MongoService();
    static Logger logger = LogManager.getLogger(MongoService.class);

    public static MongoService getInstance() {
        return instance;
    }

    ////////////////////////////////////////////////////////////////////////////
    public WriteResult create(BoType boType, HashMap<String, Object> data) throws DALException {
        logger.info("insert " + boType);
        try {
            DBCollection collection = MongoConnectionUtil.getInstance().getDB().getCollection(boType.toString());

            BasicDBObject doc = new BasicDBObject(data);

            return collection.insert(doc);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DALException(e.getMessage());
        }
    }

    public WriteResult update(BoType boType, HashMap<String, Object> data) throws DALException {
        logger.info("update " + boType);
        try {
            DBCollection collection = MongoConnectionUtil.getInstance().getDB().getCollection(boType.toString());

            BasicDBObject updatedDocument = new BasicDBObject();
            updatedDocument.put("_id", data.get("_id"));

            BasicDBObject searchQuery = new BasicDBObject(data);
            return collection.update(searchQuery, updatedDocument);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DALException(e.getMessage());
        }
    }

    public List<DBObject> list(BoType boType) throws DALException {
        logger.info("list()");
        List<DBObject> dbObjects = new ArrayList();
        try {

            DBCollection coll = MongoConnectionUtil.getInstance().getDB().getCollection(
                    boType.toString());
            DBCursor cursor = coll.find();
            while (cursor.hasNext()) {
                dbObjects.add(cursor.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DALException(e.getMessage());
        }

        return dbObjects;
    }

    public List<DBObject> listByAppDomain(BoType boType, Long appDomainId) throws DALException {
        logger.info("list()");
        List<DBObject> dbObjects = new ArrayList();
        try {
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("app_domain", appDomainId.toString());

            DBCollection coll = MongoConnectionUtil.getInstance().getDB().getCollection(
                    boType.toString());
            DBCursor cursor = coll.find(whereQuery);
            while (cursor.hasNext()) {
                dbObjects.add(cursor.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DALException(e.getMessage());
        }

        return dbObjects;
    }
}
