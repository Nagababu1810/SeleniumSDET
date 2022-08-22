package javaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrintgDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileWriter fw=new FileWriter("C:\\Users\\Naga Babu\\Desktop\\Syallbus.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("java with selenium");
		bw.write("phyton with selenium");
		bw.write("c with selenium");
		
		System.out.println("Completed");
		bw.close();
		
		
		
	}

}
