package com.itcast.demo24_ģ��LineNumberReader��;

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
	//���lineNumber��ӹ��е�get��set����

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//ģ��readLine()����
	public String readLine() throws IOException{
		//����ʹ��FileReaderÿ�ζ�ȡһ���ַ���Ȼ���װһ���ַ�����
		StringBuffer buf = new StringBuffer();
		
		int n = 0;
		while((n = this.reader.read()) != -1){
			if(n == '\r'){
				continue;//������һ���ַ�
			}
			if(n == '\n'){
				this.lineNumber++;
				return buf.toString();
			}
			//��װ�ַ�
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
