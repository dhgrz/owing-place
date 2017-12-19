package com.itcast.demo21_����¼��5��ѧԱ�ɼ�����д���ļ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�

   1.��Ҫһ��Student�ࣻ
   		String name;
   		int chinese;
   		int math;
   		int english;
   		getSum();
   2.¼��5��ѧԱ��
   		ʹ��ѭ����Scanner��ȡ���ݣ���װStudent
   		��Ϊ��Ҫ���ܷ���������Ϊֻ�洢Student�Ϳ��ԣ����д洢������ʹ��TreeSet
   		
 */
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> stuSet = new TreeSet<>(new Comparator(){

			public int compare(Object o1, Object o2) {
				Student stu1 = (Student)o1;
				Student stu2 = (Student)o2;
				//�Ƚ��ܷ֣�����
				int sum = stu2.getSum() - stu1.getSum();
				//����ܷ���ͬ�������ķ֣�����
				int num1 = (sum == 0 ? stu1.getChinese() - stu2.getChinese() : sum);
				//���������ͬ������ѧ
				int num2 = (num1 == 0 ? stu1.getMath() - stu2.getMath() : num1);
				//�����ѧ��ͬ����Ӣ��
				int num3 = (num2 == 0 ? stu1.getEnglish() - stu2.getEnglish() : num2);
				//�����ѧҲ��ͬ��������
				int num4 = (num3 == 0 ? stu1.getName().compareTo(stu2.getName()) : num3);
				
				return num4;
			}});
		for(int i = 1 ;i <= 5 ; i++){
			System.out.println("������� " + i + " ��ѧԱ��Ϣ��");
			System.out.print("������");
			String name = sc.next();
			System.out.print("���ģ�");
			int chinese = sc.nextInt();
			System.out.print("��ѧ");
			int math = sc.nextInt();
			System.out.print("Ӣ�");
			int english = sc.nextInt();
			
			//��װStudent����
			Student stu = new Student(name,chinese,math,english);
			//��ӵ�����
			stuSet.add(stu);
		}
		
		//��������
		System.out.println("�������ϣ�");
		System.out.println("\t����\t�ܷ�\t����\t��ѧ\tӢ��");
		for(Student stu : stuSet){
			System.out.println("\t"  + stu.getName() + "\t" + stu.getSum() + "\t" + 
								stu.getChinese() + "\t" + stu.getMath() + "\t" +
								stu.getEnglish());
			
		}
		
		//������д���ļ�
		try {
			if(saveToFile(stuSet)){
				System.out.println("�����ѱ��棡");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("д������ʱ�����쳣������ϵͳ����Ա��ϵ��");
		}
	}

	private static boolean saveToFile(TreeSet<Student> stuSet) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("student.txt"));
		out.write("\t����\t�ܷ�\t����\t��ѧ\tӢ��");
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
