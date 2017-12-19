package com.itcast.demo09_序列化和反序列化_ObjectOutputStream_ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化和反序列化：
 * 
 * 1.序列化流：ObjectOutputStream:它可以将一个对象写入到文本文件中，或者通过网络传输；
 * 2.反序列化流：ObjectInputStream:它可以将一个序列化的对象反序列化；
 * 
 * 注意：
 * 1.需要被序列化的对象必须实现java.io.Serializable接口；
 * 2.Serializable接口没有任何方法。没有任何方法的接口，叫：标记接口。
 * 3.一个类的对象被序列化后，可能会被更改，如果发生更改后，再反序列化，将会抛出java.io.InvalidClassException异常；
 *   解决方法：需要被序列化的类中添加serialVersionUID变量；此变量如果跟序列化的对象的值相同，就认为是相同版本的。
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.序列化
	//	Student stu = new Student("张三",20,'男');
		try {
			/*ObjectOutputStream out = new ObjectOutputStream(
										new FileOutputStream("ObjectOutputStream.txt"));
			out.writeObject(stu);
			out.close();
			System.out.println("输出完毕！");*/
			
			//返序列化
			ObjectInputStream in = new ObjectInputStream(
										new FileInputStream("ObjectOutputStream.txt"));
			Object obj = in.readObject();
			Student stu2 = (Student)obj;
			System.out.println("读取的内容：" + stu2.getName() + "--" + stu2.getAge() + "--" + stu2.getSex());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
