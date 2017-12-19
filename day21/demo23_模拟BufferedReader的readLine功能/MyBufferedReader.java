package com.itcast.demo23_模拟BufferedReader的readLine功能;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	private FileReader reader;
	private String filePath;
	
	public MyBufferedReader(String path) throws FileNotFoundException{
		this.filePath = path;
		reader = new FileReader(this.filePath);
	}
	
	//模拟readLine()功能
	public String readLine() throws IOException{
		//我们使用FileReader每次读取一个字符，然后封装一个字符串；
		StringBuffer buf = new StringBuffer();
		
		int n = 0;
		while((n = this.reader.read()) != -1){
			if(n == '\r'){
				continue;//继续下一个字符
			}
			if(n == '\n'){
				return buf.toString();
			}
			//封装字符
			buf.append((char)n);
		}
		return buf.length() == 0 ? null : buf.toString();
		
	}
	
	//close
	public void close() throws IOException{
		this.reader.close();
	}
	

}
