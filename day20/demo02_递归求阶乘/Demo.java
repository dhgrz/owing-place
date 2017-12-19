package com.itcast.demo02_递归求阶乘;
/*
 * 使用递归求阶乘：
 * 
 * 例如：求5的阶乘：5!:1 * 2 * 3 * 4 * 5
 * 
 * 用递归怎么做？
 * 1.将问题分解：5！
 *          5 * 4！
 *          5 * 4 * 3！
 *          5 * 4 * 3 * 2！
 *          5 * 4 * 3 * 2 * 1!
 */
public class Demo {
	public static void main(String[] args) {
		int startNum = 1;
		int maxNum = 5;
		int result = 1;
		/*
		while(startNum <= maxNum){
			result *= startNum;
			startNum++;
		}
		System.out.println(maxNum + "的阶乘为：" + result);*/
		
		System.out.println("递归求阶乘的结果：" + jieCheng(maxNum));
	}
	
	public static int jieCheng(int num){//5,4,3,2,1
		if(num == 1){
			return 1;
		}
		int result = num * jieCheng(num -1);
		return result;
	}
}
