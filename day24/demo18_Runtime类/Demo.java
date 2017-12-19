package com.itcast.demo18_Runtime¿‡;

import java.io.IOException;

public class Demo {
		public static void main(String[] args) {
			Runtime r = Runtime.getRuntime();
			try {
				r.exec("notepad");
				r.exec("calc");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
