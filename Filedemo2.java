package internship22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("d:\\internship.txt");
		
		Scanner sc=new Scanner(System.in);
		String filename=sc.next();
		File obj1=new File("d:\\"+filename);
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		byte cities[]= {'a','b','c','d'};
		int ch;
		byte city[]= {};
		
		try {
			fos=new FileOutputStream(obj);
			fos.write(cities);
			fis=new FileInputStream(obj);
			while((ch=fis.read())!=-1)
			{
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
