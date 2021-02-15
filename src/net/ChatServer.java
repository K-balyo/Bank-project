package net;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
		private Vector handlers;//���͸��� set �̳� linkedlist �ε� ���� ���߿� �����غ���
		public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket (port);
			handlers = new Vector();
			System.out.println("chatServer is ready.");
			while (true) {
				Socket client = server.accept ();
				ChatHandler c = new ChatHandler (this, client);
				c.start ();
			}
		}catch(Exception e) {}
	}
		public Object getHandler(int index) {
			return handlers.elementAt(index); //Ư������ڿ� ä���� �� �ְ� ���ִ� �ڵ�
		}
		public void register(ChatHandler c) {
			handlers.addElement(c);
		}
		public void unregister(Object o) {
			handlers.removeElement(o);
		}
		public void broadcast (String message) {   //public synchronized void broadcast �� �ڵ嵵 ����
			StringBuffer sb = new StringBuffer();
			synchronized (handlers) {                 // ����ȭ ó��
				int n = handlers.size();
				for (int i = 0; i < n; i++) {
					ChatHandler c = (ChatHandler) handlers.elementAt(i);
					sb.append(c.getUser() + "|"); // -> ȫ�浿|ȫ�浿2 ...
					
//					try {
//						c.println(message);
//					} catch (Exception ex) {
//						ex.printStackTrace();
//					}
				}
			   for (int i = 0; i < n; i++) {
				   ChatHandler c = (ChatHandler) handlers.elementAt(i);
				   try {
						c.println(sb.toString() + message);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
			   }
			}
	}
		
	public static void main(String[] args) {
		new ChatServer(9830);
	}

}
