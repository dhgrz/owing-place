package com.itcast.demo02_�ڴ������_ByteArrayInputStream_ByteArrayOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 	�����ֽ�����
		ByteArrayInputStream:����ȡ���������byte����
			���죺ByteArrayInputStream(byte[] buf)  ����һ�� ByteArrayInputStream��ʹ�� buf ��Ϊ�仺�������顣
			������read();
			
		ByteArrayOutputStream��������һ��byte����Ļ��档�������������byte����
			���죺ByteArrayOutputStream()������һ���µ� byte �����������
			������toByteArray():��ȡ�ڲ�����������
	�����ַ�����
		CharArrayReader
		CharArrayWrite
	�����ַ���
		StringReader
		StringWriter

 */
public class Demo {
	public static void main(String[] args) throws IOException {
		/*FileInputStream in = new FileInputStream("a.txt");
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray))!= -1){
			//��ǰҪô�����̨�����Ҫôд����һ���ļ���
			//�����ʱ������ʲô����������ֻ���Ȼ�ȡ���ݣ�Ȼ�������������飻
			//�ǲ�����Ҫ��ÿ��ȡ����byte�������������
		}*/
		ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
		for(int i = 1 ; i <= 10; i++){
			byteArrayOut.write(("hello" + i).getBytes());
		}
		//����Ҫ�ر�
	//	byteArrayOut.close();
		
		//ȡ�����ݣ�
		//1.��ͨ��ByteArrayOutputStream��ȡһ��byte����
		byte[] byteArray = byteArrayOut.toByteArray();
		//2.ʹ��ByteArrayInputStream��ȡ�������ݣ�
		ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArray);
		int n = 0;
		while((n = byteArrayIn.read()) != -1){
			System.out.println((char)n);
		}
		
	}
}
