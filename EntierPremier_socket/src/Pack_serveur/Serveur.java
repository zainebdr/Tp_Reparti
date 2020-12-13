/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_serveur;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
   static final int port=1200;
    public static void main(String[] args) throws Exception {
        ServerSocket s =new ServerSocket(port);
        System.out.println("Attente de cnx");
        Socket sk_cl=s.accept();
        System.out.println("Cnx etablie");
        BufferedReader in_serv = new BufferedReader(new InputStreamReader(sk_cl.getInputStream()));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sk_cl.getOutputStream())), true);

        String x = in_serv.readLine();
             int i,j,n_diviseurs;       
                    for(i=1;i<=parseInt(x);i++)
                        {   n_diviseurs=0;
                           for(j=1;j<=i;j++)
                        {
                          if(i%j==0)
                          n_diviseurs=n_diviseurs+1;
                         }
                         if(n_diviseurs<=2)
                          System.out.println(i+" ");
                     }         
  
        in_serv.close();
        out.close();

        sk_cl.close();
    }}
 

