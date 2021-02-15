package net;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
		private Vector handlers;//벡터말고 set 이나 linkedlist 로도 가능 나중에 연습해보기
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
			return handlers.elementAt(index); //특정사용자와 채팅할 수 있게 해주는 코드
		}
		public void register(ChatHandler c) {
			handlers.addElement(c);
		}
		public void unregister(Object o) {
			handlers.removeElement(o);
		}
		public void broadcast (String message) {   //public synchronized void broadcast 이 코드도 가능
			StringBuffer sb = new StringBuffer();
			synchronized (handlers) {                 // 동기화 처리
				int n = handlers.size();
				for (int i = 0; i < n; i++) {
					ChatHandler c = (ChatHandler) handlers.elementAt(i);
					sb.append(c.getUser() + "|"); // -> 홍길동|홍길동2 ...
					
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
