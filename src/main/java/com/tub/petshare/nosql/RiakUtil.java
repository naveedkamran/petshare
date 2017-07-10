package com.tub.petshare.nosql;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.FetchValue;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.core.RiakCluster;
import com.basho.riak.client.core.RiakNode;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.core.query.RiakObject;
import com.tub.petshare.domain.RiakFile;
import com.tub.petshare.service.Constants;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author naveed
 */
public class RiakUtil {

    private static RiakUtil mongoService = null;

    public static final RiakUtil getInstance() {
        if (mongoService == null) {
            mongoService = new RiakUtil();
        }

        return mongoService;
    }

    private static RiakCluster cluster = null;

    // This will create a client object that we can use to interact with Riak
    public static RiakCluster setUpCluster() throws UnknownHostException {
        if (cluster != null) {
            return cluster;
        }
        // This example will use only one node listening on localhost:10017
        RiakNode node = new RiakNode.Builder()
                .withRemoteAddress(Constants.riak_host)
                .withRemotePort(Constants.riak_port)
                .build();

        // This cluster object takes our one node as an argument
        cluster = new RiakCluster.Builder(node).build();

        // The cluster must be started to work, otherwise you will see errors
        cluster.start();

        return cluster;
    }

    public RiakClient getRiakClient() throws UnknownHostException {
        return new RiakClient(setUpCluster());
    }

    /**
     * namespaceName = "books" objectKey = "moby_dick"
     */
    public void create(RiakFile objectToPerisit, String objectKey, String namespaceName)
            throws UnknownHostException, ExecutionException, InterruptedException {
        RiakClient client = RiakUtil.getInstance().getRiakClient();

        Namespace booksBucket = new Namespace(namespaceName);
        Location mobyDickLocation = new Location(booksBucket, objectKey);
        StoreValue storeBookOp = new StoreValue.Builder(objectToPerisit)
                .withLocation(mobyDickLocation)
                .build();
        client.execute(storeBookOp);
        System.out.println("Moby Dick information now stored in Riak");

    }

    public String read(String objectKey, String namespaceNam)
            throws UnknownHostException, UnknownHostException, ExecutionException, InterruptedException {
        RiakClient client = RiakUtil.getInstance().getRiakClient();

        Namespace quotesBucket = new Namespace(namespaceNam);
        Location quoteObjectLocation = new Location(quotesBucket, objectKey);
        FetchValue fetchOp = new FetchValue.Builder(quoteObjectLocation)
                .build();
        RiakObject fetchedObject = client.execute(fetchOp).getValue(RiakObject.class);

        return fetchedObject.getValue().toString();
    }

    public static void main(String[] args) {
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

//
//            String objectKey = "files";
//            String namespaceNam = "pics";
//
//            RiakUtil.getInstance().create(objectToPerisit, objectKey, namespaceNam);
//
//            Namespace quotesBucket = new Namespace(namespaceNam);
//            Location quoteObjectLocation = new Location(quotesBucket, objectKey);
//            FetchValue fetchOp = new FetchValue.Builder(quoteObjectLocation)
//                    .build();
//            RiakObject fetchedObject = client.execute(fetchOp).getValue(RiakObject.class);
//            System.out.println(">>>>>>>>>>>>>>>>>>>>******** " + fetchedObject.getValue().toString());
//
//            System.out.println("Put lu");
        } catch (Exception ex) {
            Logger.getLogger(RiakUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
