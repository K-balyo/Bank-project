package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx10 {

	public static void main(String[] args) throws IOException{
		// �Է��� ����, ���ڿ��� ���Ϸ� �����Ͻÿ�
		File file = new File("C:/IO/IOtest1.txt");
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fwriter);
		PrintWriter pw = new PrintWriter(bw, true);
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("�Է� : ");
		String str = "";
		while (!str.equals("end")) {
			str = br.readLine();
			pw.println(str);
		}
		br.close();
		pw.close();

	}

}
