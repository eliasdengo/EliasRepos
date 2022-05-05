/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.chatclient;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author wings
 */
public class SimpleChatClient implements ActionListener{
    JTextArea jta;
    JTextField jtf;
    InputStreamReader input;
    BufferedReader reader;
    PrintWriter pw;
    Socket socket;
    
    public void go(){
    JFrame frame=new JFrame("Simple Chat Client");
    JPanel panel=new JPanel();
    jta=new JTextArea();
    
    jta.setLineWrap(true);
    jta.setWrapStyleWord(true);
    jta.setEditable(false);
    jtf=new JTextField();
    
    JScrollPane scroll=new JScrollPane(jta);
    scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    
    JButton btn=new JButton("Send");
    btn.addActionListener(this);
     setNetworking();
     
     Thread thread=new Thread((Runnable) new IncommingReader());
     thread.start();
     
     panel.add(jta);
     panel.add(jtf);
     panel.add(btn);
     
     frame.getContentPane().add(BorderLayout.CENTER,panel);
     frame.setSize(400, 500);
     frame.setVisible(true);
    
    
    }

    private void setNetworking() {
        try {
            Socket s=new Socket("127.0.0.1",5000);
          input =new InputStreamReader(s.getInputStream());
          reader=new BufferedReader(input);
          pw=new PrintWriter(s.getOutputStream());
          System.out.println("nettowrking establish");
        } catch (IOException ex) {
            Logger.getLogger(SimpleChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
               pw.write(jtf.getText());
       pw.flush();
    }

 public class IncommingReader implements Runnable {


    @Override
    public void run() {
   String message;
       
   try {
            
            while((message=reader.readLine())!=null){
                
                System.out.println("read"+message);
                jta.append(message + "\n");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(SimpleChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
    
}




