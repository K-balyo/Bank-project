package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatHandler extends Thread{
	private Socket s; 
	private BufferedReader i;
	private PrintWriter o;
	private ChatServer server;
	private String user;
	
	public ChatHandler(ChatServer server, Socket s) throws IOException{
		this.s = s;
		this.server = server;
		InputStream ins = s.getInputStream();
		OutputStream os = s.getOutputStream();
		i = new BufferedReader(new InputStreamReader(ins));
		o = new PrintWriter(new OutputStreamWriter(os), true);
	}

	@Override
	public void run() {
		String name = "";
		try {
			name = i.readLine();
			user = name;
			server.register(this);
			broadcast(name + "´ÔÀÌ ¹æ¹®ÇÏ¼Ì½À´Ï´Ù.");
			while (true) {
				String msg = i.readLine();
				broadcast(name + " - " + msg);
			}
		} catch (IOException ex) {
		}
		server.unregister(this);
		broadcast(name + "´ÔÀÌ ³ª°¡¼Ì½À´Ï´Ù.");
		try {
			i.close();
			o.close();
			s.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}// end run ´Ý´Â °÷
	
	protected void broadcast(String message) {
		server.broadcast(message);
	}

	protected void println(String message) {
		o.println(message);
	}
	public String getUser() {
		return this.user;
	}

}

