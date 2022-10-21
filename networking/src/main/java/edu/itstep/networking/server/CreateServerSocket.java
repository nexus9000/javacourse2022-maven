package edu.itstep.networking.server;

import java.io.File;

public class CreateServerSocket {
    private static final int PORT_TCP = 10_000;
    private static final File SHARED_DIR = new File("media");
    public static void main(String...arg){
        String typeServer = "TCP TIME SERVER";
        GetServerFactory gsf = new GetServerFactory();
        Server server = gsf.getServerInstance(typeServer,PORT_TCP, SHARED_DIR);
        Thread tcp = new Thread(server,typeServer);
        tcp.start();
    }
}
