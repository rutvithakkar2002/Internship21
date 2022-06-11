package internship22;
abstract class B
{
	abstract void print();
}
public class A extends B {
	void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();
	}
}
