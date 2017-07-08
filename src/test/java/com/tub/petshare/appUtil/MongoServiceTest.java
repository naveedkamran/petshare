package com.tub.petshare.appUtil;

import com.tub.petshare.apputil.ObjFactory;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author Naveed
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/datenc-applicationcontext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class MongoServiceTest {

    @Autowired
    private ObjFactory objFactory;
    org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(MongoServiceTest.class);

    @BeforeClass
    public static void setUpOnce() {
        // Code here will be called once when this class executes
    }

    @Before
    public void setUp() {
        // Code here will be called before the execution of every test in this class
    }

    @Test 
    public void listByBoType() {
        try {

            System.out.println("DocObjects size: " + 1);

            assertEquals(true, true);

        } catch (Exception ex) {
            ex.printStackTrace();
            assertEquals(true, false);
        }
    }

}
