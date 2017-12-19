package com.itcast.demo21_键盘录入5名学员成绩排序写入文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件

   1.需要一个Student类；
   		String name;
   		int chinese;
   		int math;
   		int english;
   		getSum();
   2.录入5名学员：
   		使用循环，Scanner获取数据，封装Student
   		因为需要按总分排序，又因为只存储Student就可以，单列存储，所以使用TreeSet
   		
 */
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> stuSet = new TreeSet<>(new Comparator(){

			public int compare(Object o1, Object o2) {
				Student stu1 = (Student)o1;
				Student stu2 = (Student)o2;
				//比较总分：降序
				int sum = stu2.getSum() - stu1.getSum();
				//如果总分相同，排语文分，升序
				int num1 = (sum == 0 ? stu1.getChinese() - stu2.getChinese() : sum);
				//如果语文相同，排数学
				int num2 = (num1 == 0 ? stu1.getMath() - stu2.getMath() : num1);
				//如果数学相同，排英语
				int num3 = (num2 == 0 ? stu1.getEnglish() - stu2.getEnglish() : num2);
				//如果数学也相同；排姓名
				int num4 = (num3 == 0 ? stu1.getName().compareTo(stu2.getName()) : num3);
				
				return num4;
			}});
		for(int i = 1 ;i <= 5 ; i++){
			System.out.println("请输入第 " + i + " 名学员信息：");
			System.out.print("姓名：");
			String name = sc.next();
			System.out.print("语文：");
			int chinese = sc.nextInt();
			System.out.print("数学");
			int math = sc.nextInt();
			System.out.print("英语：");
			int english = sc.nextInt();
			
			//封装Student对象
			Student stu = new Student(name,chinese,math,english);
			//添加到集合
			stuSet.add(stu);
		}
		
		//遍历集合
		System.out.println("遍历集合：");
		System.out.println("\t姓名\t总分\t语文\t数学\t英语");
		for(Student stu : stuSet){
			System.out.println("\t"  + stu.getName() + "\t" + stu.getSum() + "\t" + 
								stu.getChinese() + "\t" + stu.getMath() + "\t" +
								stu.getEnglish());
			
		}
		
		//将集合写入文件
		try {
			if(saveToFile(stuSet)){
				System.out.println("数据已保存！");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入数据时发生异常，请于系统管理员联系！");
		}
	}

	private static boolean saveToFile(TreeSet<Student> stuSet) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("student.txt"));
		out.write("\t姓名\t总分\t语文\t数学\t英语");
		out.newLine();
		for(Student stu : stuSet){
			out.write("\t" + stu.getName() + "\t" +
							stu.getSum() + "\t" +
							stu.getChinese() + "\t" +
							stu.getMath() + "\t" + 
							stu.getEnglish());
			out.newLine();
			out.flush();
		}
		out.close();
		return true;
		
		
	}
}
