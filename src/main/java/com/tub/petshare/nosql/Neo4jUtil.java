package com.tub.petshare.nosql;

import com.tub.petshare.service.Constants;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import static org.neo4j.driver.v1.GraphDatabase.driver;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import static org.neo4j.driver.v1.Values.parameters;

/**
 *
 * @author naveed
 */
public class Neo4jUtil {

    private static Neo4jUtil mongoService = null;

    public static final Neo4jUtil getInstance() {
        if (mongoService == null) {
            mongoService = new Neo4jUtil();
        }

        return mongoService;
    }

    Session session = null;
    Driver driver = null;

    public Session getSession() {
        if (session != null) {
            return session;
        }

        driver = GraphDatabase.driver("bolt://" + Constants.neo_host + ":" + Constants.neo_port,
                AuthTokens.basic(Constants.neo_user, Constants.neo_pass));
        session = driver.session();

        return session;
    }

    public void closeSession() {
        session.close();
        driver.close();
    }

    public void runQuery(Session session) {
        session.run("CREATE (a:Person {name: {name}, title: {title}})",
                parameters("name", "Arthur", "title", "King"));

        StatementResult result = session.run("MATCH (a:Person) WHERE a.name = {name} "
                + "RETURN a.name AS name, a.title AS title",
                parameters("name", "Arthur"));
        while (result.hasNext()) {
            Record record = result.next();
            System.out.println(record.get("title").asString() + " " + record.get("name").asString());
        }

    }
}
