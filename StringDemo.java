package internship22;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String();
		int count=0,countc=0,countv=0,counts=0,countp=0;
		System.out.println("Enter a paragraph:");
		str=sc.nextLine();
		String a[]=str.split(" ");
		System.out.println("1------Count pail-in-drom words");
		System.out.println("2------Count number of vowels and consonents");
		System.out.println("3------Count number of occuring of that words.");
		System.out.println("4------Exit");
		while(true)
		{
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{	
				case 1:
					StringBuffer sb=new StringBuffer(str);
					sb.reverse();
					String rev=sb.toString();
					for(int i=0;i<str.length();i++)
					{
						if(rev.equals(str))
						{
							countp++;
						}
					}
					System.out.println("Pail-in-drom words are: "+countp);
					break;
				case 2:
					for(int i=0;i<str.length();i++)
					{
						char ch=str.charAt(i);
						if(ch=='a' || ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
						{
							countv++;
						}
						else if ((ch >= 'a' && ch <= 'z'))
						{
							countc++;
						}
						else
						{
							counts++;
						}
					}
					System.out.println("Vowels are: "+countv);
					System.out.println("Consonents are: "+countc);
					System.out.println("Spaces are: "+counts);
					break;
				case 3:
					System.out.println("Enter a word which you want to find the occurance:");
					String word=sc.next();
					for(int i=0;i<a.length;i++)
					{
						if(a[i].equalsIgnoreCase(word))
						{
							count++;
						}
					}
					System.out.println(word+" is "+count+" times repeated...");
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}
