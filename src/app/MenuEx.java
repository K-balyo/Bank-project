package app;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MenuEx extends Frame implements ActionListener{
	public MenuBar mb;
	public Menu m;
	public MenuItem[] mi;
	public FileDialog fd_load, fd_save;
	public TextArea ta;// add TextArea 추가
/*실습 문제
 * 
 * 1. Exit 메뉴 아이템 선택시 프로그램 종료
	*/
	public MenuEx() {
		ta = new TextArea();
		ta.setEditable(false);
		fd_load = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fd_save = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		mb = new MenuBar();
		m = new Menu("File");
		mi = new MenuItem[5];
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("EXIT");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램을 종료하겠다 라는 명령어
			}
		});
		for(int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);
			if( i != 2 && i != (mi.length -1))
				m.addSeparator();
		}
		
		mi[1].setEnabled(false);
		mb.add(m);
		setMenuBar(mb);
		add(ta, "Center");
		setSize(500, 500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj.equals(mi[4])) {
			System.exit(0);
		}else if( obj == mi[0]) {
				mi[1].setEnabled(true);
				ta.setEditable(true);	
		}else if (obj == mi[0]) {     
			// New File
			mi[1].setEnabled(true);
		}else if (obj == mi[1]) { 
			// Open File
			ta.setText("");
			fd_load.setVisible(true);
			BufferedReader br = null;
			try {
			br = new BufferedReader(new FileReader(
			new File(fd_load.getDirectory()) + "/" + fd_load.getFile()));
			while(br.ready())   {
				String str = br.readLine();
				ta.append(str);
			}
			}catch(IOException exx) {
				exx.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		
		}else if (obj == mi[2]) { 
			// Save File
			BufferedWriter bw = null;
			try {
				bw =new	BufferedWriter(new FileWriter(
						new File("C:/IO/menu.txt")));
				bw.write(ta.getText());
				bw.flush();
			}catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				try{
					bw.close();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}	
		}else if (obj == mi[3]) { 
			// Save As
			fd_save.setVisible(true);
			fd_save.getDirectory();
			BufferedWriter bw = null;
			try {
				bw =new	BufferedWriter(new FileWriter(
						new File(fd_save.getDirectory() 
								+ fd_save.getFile())));
				bw.write(ta.getText());
				bw.flush();
			}catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				try{
					bw.close();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}	
		}
	}

	public static void main(String[] args) {
		new MenuEx();
	}
	

}
// 1번문제 exit 메뉴를 누르면 종료되게 하시오