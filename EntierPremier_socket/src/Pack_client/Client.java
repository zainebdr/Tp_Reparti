/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author marye
 */
public class Client {
     static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("demande de cnx");


        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("Connection etablie");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
         BufferedReader entre = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Saisie un entier positif ");
          String str = entre.readLine(); 

         out.println(str);
        in.close();
        out.close();

        socket.close();
       
}}
