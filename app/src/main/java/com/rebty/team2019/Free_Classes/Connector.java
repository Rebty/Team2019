package com.rebty.team2019.Free_Classes;

import java.net.Socket;

class Connector extends Thread
{
    public static void main(String args[])
    {
    	StringBuilder arg=new StringBuilder();
        try
        {
            // ��������� ����� � ����������� � localhost:3128
            // �������� ����� �������
            Socket s = new Socket("localhost", 250);

            for(int i=0;i<args.length;i++){
            	arg.append(args[i]+" ");
          }
           
            args[0] = arg.append("\n"+s.getInetAddress().getHostAddress()
                            +":"+s.getLocalPort()).toString();
            
            s.getOutputStream().write(args[0].getBytes());

            // ������ �����
            byte buf[] = new byte[512*1024];
            int r = s.getInputStream().read(buf);
            String data = new String(buf, 0, r+8);
            switch(data.substring(0, 3)){
             
            } 
            // ������� ����� � �������
            System.out.println(data);
            s.close();
        }
        catch(Exception e)
        {System.out.println("init error: " + e.getMessage());} // ����� ����������
    }
}