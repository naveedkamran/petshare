package com.tub.petshare.apputil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  

/**
 *
 * @author Naveed Kamran
 */
public class MongoQueryUtilSt {

    private static final MongoQueryUtilSt instance = new MongoQueryUtilSt();
    static Logger logger = LogManager.getLogger(MongoQueryUtilSt.class);

    public static MongoQueryUtilSt getInstance() {
        return instance;
    }

//    public static Criteria getBaseCriteria(Long appDomainId) {
//        return Criteria.where("appDomain").is(appDomainId);
////        return Criteria.where("appDomain").is(appDomainId).and("isDeleted").is(Boolean.FALSE).and("rstatus").is(Rstatus.active);
//    }
}
