package internship22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable
{
	int cid;
	String cName;
	float purchaseprice;
	void scanCustomerDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of cid: ");
		cid=sc.nextInt();
		System.out.println("Enter the customer Name: ");
		cName=sc.next();
		System.out.println("Enter the purchase price: ");
		purchaseprice=sc.nextFloat();	
	}
	void displayCustomerDetails()
	{
		System.out.println(cid+" "+cName+" "+purchaseprice);
	}
	
}

public class Objectwriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer objCustomer=new Customer();
		objCustomer.scanCustomerDetails();
		File objFile=new File("D:\\object.txt");
		FileOutputStream fos=null;
		ObjectOutputStream obos=null;
		FileInputStream fis=null;
		ObjectInputStream obis=null;
		
		try
		{
			fos=new FileOutputStream(objFile);
			obos=new ObjectOutputStream(fos);
			obos.writeObject(objCustomer);
			fos.close();
			obos.close();
			fis=new FileInputStream(objFile);
			obis=new ObjectInputStream(fis);
			Customer newCustomer=(Customer)obis.readObject();
			newCustomer.displayCustomerDetails();
		}
		catch(ClassCastException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fos.close();
				fos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
