¸ package com.coderscampus.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileIOExample {

//	public static void main (String[] args) {
//		//there are a few different ways to read files. bufferend reader is the old type
//		BufferedReader fileReader = null; 
//		try {
//			fileReader = new BufferedReader(new FileReader("data.txt"));
//			
//				String line; 
//				while ((line = fileReader.readLine()) != null) {
//					System.out.println(line);
//				}
//			System.out.println(fileReader.readLine());
//		} catch (FileNotFoundException e) {
//			System.out.println("Oops, the file was not found");
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fileReader.close();
//				System.out.println("Closing file reader");
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
//		}
//	}
//}
//		   
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			System.out.println("closing file reader");
			fileReader.close();
		}
	}
	
}
