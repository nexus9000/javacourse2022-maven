package edu.itstep.networking.server;

import java.io.IOException;

public abstract class Server extends Thread{
    protected int port;
    protected String typeServer;
    abstract int getPort();
    abstract String getTypeServer();
    abstract void startServer()throws IOException;
    @Override
    public abstract void run();
}
