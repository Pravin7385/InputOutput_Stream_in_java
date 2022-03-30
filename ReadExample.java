package com.iostream;

import java.io.FileInputStream;
import java.util.Scanner;

// 1.Read
public class ReadExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\pravin bhujbale\\Desktop\\one.txt");
			
			Scanner scanner = new Scanner(fis);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());				
			}
			scanner.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
