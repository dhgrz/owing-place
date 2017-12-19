package com.itcast.demo24_模拟LineNumberReader类;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReader {
	private FileReader reader;
	private int lineNumber;
	private String path;
	
	public MyLineNumberReader(String path) throws FileNotFoundException{
		this.path = path;
		reader = new FileReader(path);
	}
	//针对lineNumber添加公有的get和set方法

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
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
				this.lineNumber++;
				return buf.toString();
			}
			//封装字符
			buf.append((char)n);
		}
		if(buf.length() > 0){
			this.lineNumber ++;
			return buf.toString();
		}else{
			return null;
		}
		
		
	}
	
	//close
	public void close() throws IOException{
		this.reader.close();
	}
	
}
