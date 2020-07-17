package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentClient {

    //private static final Logger LOG = LoggerFactory.getLogger(StudentClient.class);
    public static ManagedChannel getChannelInstance(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        return channel;
    }
}
