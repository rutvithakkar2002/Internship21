package internship22;

public class Person {
	private int age;
	private Person()
	{
		age=23;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		System.out.println(p.age);
	}
}		
class Person2
{
	Person p=new Person();
	System.out.println(p.age);
}