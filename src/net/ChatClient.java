package net;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame
	implements Runnable, ActionListener{
		private BufferedReader i;
		private PrintWriter o;
		private JTextArea output;
		private JTextField input;
		private JLabel label;
		private Thread listener;
		private String host;
        private JScrollPane jp;
        private JScrollBar jb;
        private JPanel bottom;
        private List userList;
        
		public ChatClient (String server) {
	    	super("채팅 프로그램");
	    	host = server;
	    	userList = new List();
	    	listener = new Thread(this);
	    	listener.start();
	    	
	    	output = new JTextArea();
	    	jp = new JScrollPane(output);

	    	bottom = new JPanel(new BorderLayout());
	    	jb = jp.getVerticalScrollBar();
	    	jb.setValue(jb.getMaximum());
	    	
	    	
//	    	Panel a = new Panel(new BorderLayout());
	    	label = new JLabel("사용자 이름");
	    	
	    	input = new JTextField();
	    	output.setEditable(false);
	    	
	    	bottom.add(label, "West");
	    	bottom.add(input, "Center");
	    	
	    	add(userList, "East");
	    	add(bottom, "South");
	    	add(jp, "Center");
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	setSize(400, 300);
	    	setVisible(true);
	    	input.addActionListener(this);
	    	
	    }
	    @Override
	    public void run() {
	    	try {
	    		Socket s = new Socket (host, 8888);
	    		InputStream ins = s.getInputStream();
	    		OutputStream os = s.getOutputStream();
	    		i = new BufferedReader(new InputStreamReader(ins));
	    		o = new PrintWriter(new OutputStreamWriter(os), true);
	    		while(true) {
	    			String line = i.readLine();
	    			userList.clear();
	    			StringTokenizer st = new StringTokenizer(line, "|", true);
	    			String str = "";
//	    			int countTokens = st.countTokens();
	    			while(st.hasMoreTokens()) {
	    				str = st.nextToken();
	    				if( 0 != st.countTokens()) {
	    					userList.add(str);
	    				}
//	    				else {
//	    					msg = str;
//	    				}
	    			}
	    			output.append(str + "\n");	    			
	    			jb.setValue(jb.getMaximum());//채팅창 스크롤바 자동으로 맨 아랫줄
	    		}
	    		
	    	}catch (IOException ex) {}
	    }
	 
	    public void actionPerformed (ActionEvent e) {
	    	Object c = e.getSource();
	    	if(c == input) {
	    		label.setText("메시지");
	    		o.println(input.getText());
	    		input.setText("");
	    		
	    	}
	    }
	public static void main(String[] args) {
		if(args.length > 0) {
			new ChatClient(args[0]);
		}else {
			new ChatClient("localhost");
		}

	}

}
