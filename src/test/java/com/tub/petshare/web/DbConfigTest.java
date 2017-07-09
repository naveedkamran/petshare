package com.tub.petshare.web;

import com.mongodb.client.MongoDatabase;
import com.tub.petshare.nosql.MongoDbUtil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author naveed
 */
@RunWith(SpringRunner.class)
public class DbConfigTest {

    @Test
    public void shouldReturn200WhenSendingRequestToController() throws Exception {
        MongoDatabase db = MongoDbUtil.getInstance().getMongoDatabase();
        if (db == null) {
            assertEquals(true, false);
        } else {
            assertEquals(true, true);
        }
    }

}
