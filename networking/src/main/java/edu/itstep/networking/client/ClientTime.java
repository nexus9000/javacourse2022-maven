package edu.itstep.networking.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTime {
    public static final int PORT_NUMBER = 10_000;//CONSTANT PORT
    public static final String HOST_SERVER = "192.168.88.35";
    public static void main(String...arg){
        try(Socket socket = new Socket(HOST_SERVER, PORT_NUMBER);){
            System.out.println("Connecting to Server "+socket.getInetAddress());
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Enter command:");
            String line = "";
            Scanner sc = new Scanner(System.in);
            line = sc.nextLine();
            while(!line.equalsIgnoreCase("exit")){
                pw.println(line);
                pw.flush();
                String serverReply = br.readLine();//get answer by server
                System.out.println(serverReply);
                System.out.println("Type exit to terminate connection!");
                line = sc.nextLine();
            }
            sc.close();
            pw.close();
            br.close();
        }catch(IOException io){
            io.printStackTrace();
        }finally{
            System.out.println("Session terminated!");
        }
    }
}
