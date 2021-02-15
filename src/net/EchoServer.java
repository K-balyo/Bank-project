package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


//IP = 211.231.99.17
//Host = daum.net
//���� �ּ� = 192.168.0.133
//���� �̸� = DESKTOP-EIIER3R

public class EchoServer {
	private ServerSocket server;
	public EchoServer(int port) throws IOException {
		server = new ServerSocket(port);
	}
	public void service() throws IOException{
		System.out.println("EchoServer is ready.");
		
		Socket client = server.accept(); // Ŭ���̾�Ʈ�� ������ ��ٸ��� �ڵ� Socket�� ��ŵ���
		
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os, true);
		while(true) {
			String msg = in.readLine();
			System.out.println(msg);
			if(msg.equals("end")) {
				break;
			}
			out.println(">>" + msg);// �������� �޼��� �����ϴ� ����
		}
	}
	public void close() throws IOException {
		server.close();
	}
	public static void main(String[] args) {
		try {
			EchoServer es = new EchoServer(1289);
		    es.service();
		    es.close();
		}catch(Exception e){}
		
	}

}
