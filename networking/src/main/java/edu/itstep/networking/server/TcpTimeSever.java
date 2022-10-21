package edu.itstep.networking.server;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpTimeSever extends Server{
    private int port;
    private File sharedDir;
    private String typeServer;
    public TcpTimeSever(int port, File sharedDir){
        this.port = port;
        this.sharedDir = sharedDir;
    }
    @Override
    String getTypeServer() {
        return typeServer;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setTypeServer(String typeServer) {
        this.typeServer = typeServer;
    }

    @Override
    int getPort() {
        return port;
    }

    @Override
    void startServer() throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server is running..."+server.getLocalPort());
        while(true){
            Socket client = server.accept();
            ClientHandler ch = new ClientHandler(client, sharedDir);
            Thread thr = new Thread(ch);
            thr.start();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " was started!");
        try {
            startServer();
        }catch(IOException io){
            io.printStackTrace();
        }
    }

}
