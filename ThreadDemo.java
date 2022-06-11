package internship22;

class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class B1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class C1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1=new A1();
		B1 obj2=new B1();
		C1 obj3=new C1();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
