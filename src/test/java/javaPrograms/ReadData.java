package javaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*FileReader fr=new FileReader("C:\\Users\\Naga Babu\\Desktop\\Syallbus.txt");

		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while((str= br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();*/
		
		
		
		//Approach 2 scanner class and file
		
		File file=new File("C:\\Users\\Naga Babu\\Desktop\\Syallbus.txt");
		Scanner sc=new Scanner(file);
		
		
		/*while(sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		}*/
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
	}

	
	
	
}
