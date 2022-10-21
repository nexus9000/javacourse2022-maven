package edu.itstep.networking.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;
    private File sharedDir;
    public ClientHandler(Socket socket, File sharedDir){
        this.socket = socket;
        this.sharedDir = sharedDir;
    }
    @Override
    public void run(){
        System.out.println("Client with IP Address "+socket.getInetAddress()+" : "+ socket.getPort());
        ListFiles lf = new ListFiles(sharedDir);

        try(PrintWriter out = new PrintWriter(socket.getOutputStream(),true)){
            ArrayList<File> list = lf.listDirectory();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String command = br.readLine();
            System.out.println(command);
            while(true) {
                if (command.equalsIgnoreCase("get time")) {
                    out.println(java.time.LocalDateTime.now());
                }else if(command.equalsIgnoreCase("list files")){
                    StringBuilder sb = new StringBuilder();
                      for(File file : list){
                          sb.append(file.getName());
                          sb.append(";");
                      }
                      out.println(sb);
                      out.flush();
                }//end else if
                command = br.readLine();
            }//end while

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
