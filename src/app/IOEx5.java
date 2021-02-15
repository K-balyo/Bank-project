package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx5 {

	public static void main(String[] args) {
		File file = new File("C:/IO/IOtest.txt");
        FileInputStream fis;
        int readByte;
        try {
        	fis = new FileInputStream(file);
        	while(true) {
        		readByte = fis.read();
        		if(readByte == -1) {
        	    break;
        	   } 
        		System.out.print((char)readByte);
           }
        	fis.close();
        }catch(IOException e) {
        	e.printStackTrace();
        }
	}
}
