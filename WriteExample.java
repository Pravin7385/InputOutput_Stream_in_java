package com.iostream;

import java.io.FileWriter;

// 2.Write

public class WriteExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\pravin bhujbale\\Desktop\\one.txt");
			fw.write("This is the Write to destination ");
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
	
}
