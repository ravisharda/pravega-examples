package org.example.pravegaclientsamples.common;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

import java.net.URI;

@Accessors(fluent = true) @Getter
public class Client {

    private final Connection connection;

    public Client(String scope, String streamName, URI controllerURI) {
        this.connection = new Connection(scope, streamName, controllerURI);
    }

    public Client (String scope, String streamName, URI controllerURI, boolean tlsEnabled,
                   String trustStoreLocation) {

        this.connection = new Connection(scope, streamName, controllerURI,
                false, null, null,
                true, trustStoreLocation);
    }

    public Client(String scope, String streamName, URI controllerURI, boolean authEnabled,
                  String userName, String password) {
        if (authEnabled) {
            // ensure user name and passwords are not blank
        }
        this.connection = new Connection(scope, streamName, controllerURI,
                authEnabled, userName, password,
                false, null);
    }

    public static void main(String[] args) {
        //Client client = new Client(null, null, null);
        //client.connection
    }
}