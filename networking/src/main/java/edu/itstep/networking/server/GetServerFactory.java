package edu.itstep.networking.server;

import java.io.File;

public class GetServerFactory {
    public Server getServerInstance(String type, int port, File sharedFile) {
        if (type == null) return null;
        else if (type.equalsIgnoreCase("TCP TIME SERVER")) {
            return new TcpTimeSever(port, sharedFile);
        }
        return null;
    }
}

