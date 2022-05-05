/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.chatclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wings
 */
public class SimpleChatServer {
    static  ArrayList clientOutputStream;
    Socket s;
    ServerSocket ss;
    PrintWriter pw;
    public void go(){
    
        try {
            clientOutputStream=new ArrayList();
            ss=new ServerSocket();
            s=ss.accept();
            pw=new PrintWriter(s.getOutputStream());
            clientOutputStream.add(s);
            Thread t=new Thread(new ClientHandler(s));
        } catch (IOException ex) {
            Logger.getLogger(SimpleChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    private static class ClientHandler implements Runnable {
        Socket socket;
         BufferedReader reader;
         InputStreamReader isr;
        public ClientHandler(Socket s) {
            
            try {
                socket = s;
                isr = new InputStreamReader(s.getInputStream());
                reader = new BufferedReader(isr);
            } catch (IOException ex) {
                Logger.getLogger(SimpleChatServer.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    isr.close();
                } catch (IOException ex) {
                    Logger.getLogger(SimpleChatServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        @Override
        public void run() {
            String message ;
            try {
                while((message=reader.readLine())!=null){
                System.out.println("read" + message);
                tellEveryOne(message);
                
                }
            } catch (IOException ex) {
                Logger.getLogger(SimpleChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void tellEveryOne(String message) {
            Iterator it=clientOutputStream.iterator();
            while(it.hasNext()){
            
                PrintWriter pw=(PrintWriter) it.next();
                pw.write(message);
                 pw.flush();
            }
         
        }
    }
}

