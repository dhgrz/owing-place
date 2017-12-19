package com.itcast.demo23_ģ��BufferedReader��readLine����;

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
				return buf.toString();
			}
			//��װ�ַ�
			buf.append((char)n);
		}
		return buf.length() == 0 ? null : buf.toString();
		
	}
	
	//close
	public void close() throws IOException{
		this.reader.close();
	}
	

}
