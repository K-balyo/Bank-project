package app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx8 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/IO/IOtest.txt");
		FileOutputStream fw = new FileOutputStream(file);
		System.out.print("ют╥б : ");
		int output = 0;
		while(output != -1) {
			output = System.in.read();
			fw.write(output);
		}
		fw.close();
		
	}

}
