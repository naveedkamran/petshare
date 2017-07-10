package com.tub.petshare;

import com.tub.petshare.domain.RiakFile;
import com.tub.petshare.nosql.RiakUtil;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.assertj.core.api.BDDAssertions.then;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author naveed
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfigTest.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
public class ConfigTest {

    @LocalServerPort
    private int port;

    @Value("${local.management.port}")
    private int mgt;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testRiak() throws Exception {
        try {

            RiakFile objectToPerisit = new RiakFile();
            objectToPerisit.setId("1");
            objectToPerisit.setLocation("D:\\petshare-repo\\1\\file.jpg");

            String namespaceNam = "pics";

            for (int i = 0; i < 100; i++) {
                RiakUtil.getInstance().create(new RiakFile("" + i, "Value" + i), "" + i, namespaceNam);
            }

            for (int i = 0; i < 100; i++) {
                String output = RiakUtil.getInstance().read("" + i, namespaceNam);
                System.out.println(">>>>>>>>>>>>>>>>>>>>******** " + output);
            }

        } catch (Exception ex) {
            Logger.getLogger(RiakUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void shouldReturn200WhenSendingRequestToController() throws Exception {
        @SuppressWarnings("rawtypes")
        ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
                "http://localhost:" + this.port + "/", Map.class);

        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void shouldReturn200WhenSendingRequestToManagementEndpoint() throws Exception {
        @SuppressWarnings("rawtypes")
        ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
                "http://localhost:" + this.mgt + "/ping", Map.class);

        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
