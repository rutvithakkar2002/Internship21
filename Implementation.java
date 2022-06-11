package internship22;
class Animal
{
	int legs;
	String color;
	public Animal()
	{
		System.out.println("Thsi is animal constructor");
	}
	void eat()
	{
		System.out.println("The Animal eats");
	}
}
class Cat extends Animal
{
	public Cat()
	{
		System.out.println("This is cat constructor");
	}
	void mew()
	{
		System.out.println("MEW MEW MEW");
	}
}
class Dog extends Animal
{
	public Dog()
	{
		System.out.println("This is Dog constructor");
	}
	void bark()
	{
		System.out.println("Bow Bow Bow");
	}
}
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.bark();
		dog.eat();
		cat.eat();
		cat.mew();
	}
}
