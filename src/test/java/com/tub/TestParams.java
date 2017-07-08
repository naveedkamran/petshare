package com.tub;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Naveed Kamran
 */
public class TestParams {

    private static final TestParams instance = new TestParams();

    public static TestParams getInstance() {
        return instance;
    }
    static Logger logger = LogManager.getLogger(TestParams.class);
    public static final String PROPERTIES_FILE = "/META-INF/spring/properties/test-params.properties";
    Map<String, String> properties = new HashMap();

    public TestParams() {

        // creating location path for property file
        Properties prop = new Properties();
        try {
            prop.load(this.getClass().getResourceAsStream(PROPERTIES_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Object key : prop.keySet()) {
            System.out.println("Key: " + key);
            properties.put(key.toString(), prop.get(key).toString());
        }
    }

    public String getPropertyValue(String key) {
        return properties.get(key);
    }

    public Long getPropertyValueAsLong(String key) {
        return new Long(properties.get(key));
    }
}
