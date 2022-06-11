package internship22;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("D:\\internship1\\internship.txt");
		File obj1=new File("D:\\internship1");
		try
		{
			if(!obj1.exists())
			{
				obj1.mkdir();
			}
			if(!obj.exists())
			{
				obj.createNewFile();
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File already Exists");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(":File Close");
		}
	}
}

