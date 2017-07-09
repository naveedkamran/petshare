package com.tub.petshare.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tub.petshare.domain.UserAccount;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("scratch")
public class UserAccountWebTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("ISO-8859-1"));

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create() throws Exception {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("someuser");
        userAccount.setPassword("somepasstext");

        this.mvc.perform(
                post("/userAccount")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userAccount)))
                .andExpect(status().isCreated());

    }

    @Test
    public void createSampleUserAccount() throws Exception {
        for (int i = 0; i < 5; i++) {
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername("testuser" + (i + 1));
            userAccount.setPassword("testuser" + (i + 1));

            this.mvc.perform(
                    post("/userAccount")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(asJsonString(userAccount)))
                    .andExpect(status().isCreated());
        }
    }

    @Test
    public void readById() throws Exception {
        this.mvc.perform(get("/userAccount/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(1)));
    }

    @Test
    public void list() throws Exception {
        this.mvc.perform(get("/")).andExpect(status().isOk())
                .andExpect(content().contentType(contentType));
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[1].description", is("A description")));
    }

    static HttpHeaders getHeaders(String auth) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        byte[] encodedAuthorisation = Base64.encode(auth.getBytes());
        headers.add("Authorization", "Basic " + new String(encodedAuthorisation));

        return headers;
    }

    @Test
    public void update() throws Exception {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("someuser");
        userAccount.setPassword("somepasstext");

        this.mvc.perform(
                put("/userAccount", new Object[0])
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userAccount)))
                .andExpect(status().isConflict());

    }

    @Test
    public void accessUserAccountsList() {
        HttpEntity<String> requestEntity = new HttpEntity<String>(
                "{ \"name\":\"MyFirstProject\", \"description\":\"My Project Sahab\" } }",
                getHeaders("name" + ":" + "description"));

        RestTemplate template = new RestTemplate();

        List<UserAccount> list = template.getForObject(
                "http://localuserAccount:8080/userAccount",
                List.class);

        System.out.println("List Size: " + list.size());

    }

    @Test
    public void login() throws Exception {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("testuser1");
        userAccount.setPassword("testuser1");

        this.mvc.perform(
                post("/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userAccount)))
                .andExpect(status().isOk());

    }

    @Test
    public void loginBad01() throws Exception {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("testuser10000");
        userAccount.setPassword("testuser10000");

        this.mvc.perform(
                post("/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userAccount)))
                .andExpect(status().isForbidden());

    }
}
