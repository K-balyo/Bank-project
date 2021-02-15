package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOEx9 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/IO/IOtest.txt");
		Writer writer = new FileWriter(file);
		String str = "ȫ�浿";
		char[] data = str.toCharArray();
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush(); 
		writer.close();

	}

}
