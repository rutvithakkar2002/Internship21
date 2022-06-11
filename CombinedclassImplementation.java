package internship22;
abstract class A
{
	abstract void add();
	void sub()
	{
		System.out.println("This is non abstract method");
	}
}
interface B
{
	float PI=3.14f;
	void mul();
}
final class C
{
	final int x=3;
	void div()
	{
		System.out.println("Hello div from final class");
	}
}
public class CombinedclassImplementation extends A implements B{
	public void mul()
	{
		System.out.println("This is mul of interface");
	}
	void add()
	{
		System.out.println("This is the implemented abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj=new A();//we can not create an object of Abstract class 
		C obj=new C();
		CombinedclassImplementation obj1=new CombinedclassImplementation();
		obj1.add();
		obj1.mul();
		obj.div();
	}

}
