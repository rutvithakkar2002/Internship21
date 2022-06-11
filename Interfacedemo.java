package internship22;
//interface-->final static
	//	-->all methods are abstract
//abstract class-->In abstract class we can make abstract & non abstract methods
//Interface-->while In interface we can make only abstract method only..

interface Mamals  // compulsory do
{
		int x=2;
		void display();
}
interface Jumping extends Mamals
{
	void jump();
}
public class Interfacedemo implements Mamals//,Jumping{  //compulsory implement
	public void display()
	{
		System.out.println("Yes ,beta bike leja");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
