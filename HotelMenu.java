package internship22;
import java.util.Scanner;
public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*-----Welcome to our Hotel--------*");
		while(true)
		{
			System.out.println("0-------Exit");
			System.out.println("1-------Starters");
			System.out.println("2-------Snacks");
			System.out.println("3-------Deseart");
			System.out.println("4-------Beverages");
			System.out.println("5-------Mocktails");
			System.out.println("6-------Fix Course");
			System.out.println("7-------South Indian");
			System.out.println("8-------Gujarati");
			System.out.println("9-------Panjabi");
			System.out.println("10-------Pizza");
			
			System.out.println("Enter Your Choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 0:
					System.exit(0);
					break;
				case 1:
					System.out.println("You have selected Starters");
					System.out.println("1---------Soup");
					System.out.println("2---------Salad");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int starterch=sc.nextInt();
					switch(starterch)
					{
						case 1: 
							System.out.println("1---------Tometo soup");
							System.out.println("2---------Hot and sour soup");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int substarterch=sc.nextInt();
							switch(substarterch)
							{
								case 1:
									System.out.println("You have selected Tometo Soup.");
									break;
								case 2:
									System.out.println("You have selected Hot and sour soup.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------vegetable salad");
							System.out.println("2---------Vegetable and Fruit salad");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int substarterch1=sc.nextInt();
							switch(substarterch1)
							{
								case 1:
									System.out.println("You have selected vegetable salad.");
									break;
								case 2:
									System.out.println("You have selected Vegetable and Fruit salad.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;
			case 2:
					System.out.println("You have selected Snacks");
					System.out.println("1---------Bhaji-pav");
					System.out.println("2---------Pulav");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int snackch=sc.nextInt();
					switch(snackch)
					{
						case 1:
							System.out.println("1---------only bhaji");
							System.out.println("2---------Bhaji with masala pav");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsnackch=sc.nextInt();
							switch(subsnackch)
							{
								case 1:
									System.out.println("You have selected Only Bhaji.");
									break;
								case 2:
									System.out.println("You have selected Bhaji with masala pav.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------vegetable Pulav");
							System.out.println("2---------regular Pulav");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsnackch1=sc.nextInt();
							switch(subsnackch1)
							{
								case 1:
									System.out.println("You have selected vegetable pulav.");
									break;
								case 2:
									System.out.println("You have selected regular Pulav.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;
				case 3:
					System.out.println("You have selected Deseart");
					System.out.println("1---------Ice-Cream");
					System.out.println("2---------Cake");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int desertch=sc.nextInt();
					switch(desertch)
					{
						case 1:
							System.out.println("1---------Chocolate ice-cream");
							System.out.println("2---------Blue Moon");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsnackch=sc.nextInt();
							switch(subsnackch)
							{
								case 1:
									System.out.println("You have selected Chocolate ice-cream.");
									break;
								case 2:
									System.out.println("You have selected Blue Moon.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------Black Forest");
							System.out.println("2---------creamy Forest");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsnackch1=sc.nextInt();
							switch(subsnackch1)
							{
								case 1:
									System.out.println("You have selected Black Forest.");
									break;
								case 2:
									System.out.println("You have selected creamy Forest.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;
			case 4:
					System.out.println("You have selected Beverages");
					System.out.println("1---------soft drink");
					System.out.println("2---------cold drink");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int beveragech=sc.nextInt();
					switch(beveragech)
					{
						case 1:
							System.out.println("1---------Pepsi");
							System.out.println("2---------coko");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subbeveragech=sc.nextInt();
							switch(subbeveragech)
							{
								case 1:
									System.out.println("You have selected pepsi.");
									break;
								case 2:
									System.out.println("You have selected coko.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------7up");
							System.out.println("2---------Thumbs up");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsnackch1=sc.nextInt();
							switch(subsnackch1)
							{
								case 1:
									System.out.println("You have selected 7up.");
									break;
								case 2:
									System.out.println("You have selected Thumbs up.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					
					break;
				case 5:
					System.out.println("You have selected mocktails");
					System.out.println("1---------soft mocktail");
					System.out.println("2---------cold mocktail");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int mocktailch=sc.nextInt();
					switch(mocktailch)
					{
						case 1:
							System.out.println("1---------maggi");
							System.out.println("2---------Nudles");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int submocktailch=sc.nextInt();
							switch(submocktailch)
							{
								case 1:
									System.out.println("You have selected maggi.");
									break;
								case 2:
									System.out.println("You have selected Nudles.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------8up");
							System.out.println("2---------Eno");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int submocktailch1=sc.nextInt();
							switch(submocktailch1)
							{
								case 1:
									System.out.println("You have selected 8up.");
									break;
								case 2:
									System.out.println("You have selected Eno.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					
					break;
				case 6:
					System.out.println("You have selected Main Course");
					System.out.println("1---------Gujarati");
					System.out.println("2---------Panjabi");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int mainch=sc.nextInt();
					switch(mainch)
					{
						case 1:
							System.out.println("1---------regular thali");
							System.out.println("2---------Fix thali");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int submocktailch=sc.nextInt();
							switch(submocktailch)
							{
								case 1:
									System.out.println("You have selected regular thali.");
									break;
								case 2:
									System.out.println("You have selected Fix thali.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------Butter panner");
							System.out.println("2---------Mix veg");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int submocktailch1=sc.nextInt();
							switch(submocktailch1)
							{
								case 1:
									System.out.println("You have selected Butter Panner.");
									break;
								case 2:
									System.out.println("You have selected Mix veg.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;
				case 7:
					System.out.println("You have selected South Indian");
					System.out.println("1---------Dhosa");
					System.out.println("2---------Idli");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int sch=sc.nextInt();
					switch(sch)
					{
						case 1:
							System.out.println("1---------Masala Dhosa");
							System.out.println("2---------rava Dhosa");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subsch=sc.nextInt();
							switch(subsch)
							{
								case 1:
									System.out.println("You have selected masala Dhosa.");
									break;
								case 2:
									System.out.println("You have selected Rava Dhosa.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------Rava Idli");
							System.out.println("2---------Regular Idli - sambhar");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int submocktailch1=sc.nextInt();
							switch(submocktailch1)
							{
								case 1:
									System.out.println("You have selected Rava Idli.");
									break;
								case 2:
									System.out.println("You have selected Regular Idli - sambhar.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;			
				case 8:
					System.out.println("You have selected Gujarati");
					System.out.println("1---------Fix Thali");
					System.out.println("2---------regular thali");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int gch=sc.nextInt();
					switch(gch)
					{
						case 1:
							System.out.println("1---------spicy thali");
							System.out.println("2---------sweet thali");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subgch=sc.nextInt();
							switch(subgch)
							{
								case 1:
									System.out.println("You have selected spicy thali.");
									break;
								case 2:
									System.out.println("You have selected sweet thali.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------sweet");
							System.out.println("2---------Regualar sweet");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subg1ch=sc.nextInt();
							switch(subg1ch)
							{
								case 1:
									System.out.println("You have selected sweet.");
									break;
								case 2:
									System.out.println("You have selected Regular sweet.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;			
				case 9:
					System.out.println("You have selected Panjabi");
					System.out.println("1---------Vej kadhai");
					System.out.println("2---------mutter panner masala");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int pch=sc.nextInt();
					switch(pch)
					{
						case 1:
							System.out.println("1---------spicy vej kadhai");
							System.out.println("2---------sweet vej kadhai");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subpch=sc.nextInt();
							switch(subpch)
							{
								case 1:
									System.out.println("You have selected spicy vej kadhai.");
									break;
								case 2:
									System.out.println("You have selected sweet vej kadhai.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------spicy butter paneer masala");
							System.out.println("2---------Regualar sweet butter panner masala");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subpch1=sc.nextInt();
							switch(subpch1)
							{
								case 1:
									System.out.println("You have selected spicy butter paneer masala.");
									break;
								case 2:
									System.out.println("You have selected Regualar sweet butter panner masala.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;	
				case 10:
					System.out.println("You have selected Pizza");
					System.out.println("1---------margerita pizza");
					System.out.println("2---------butter paner pizza");
					System.out.println("3---------Exit");
					System.out.println("Enter your choice: ");
					int pich=sc.nextInt();
					switch(pich)
					{
						case 1:
							System.out.println("1---------spicy margarita ");
							System.out.println("2---------sweet margerita");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subpch=sc.nextInt();
							switch(subpch)
							{
								case 1:
									System.out.println("You have selected spicy margarita .");
									break;
								case 2:
									System.out.println("You have selected sweet margarita .");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 2:
							System.out.println("1---------spicy butter paneer pizza");
							System.out.println("2---------Regualar sweet butter panner pizza");
							System.out.println("3---------Exit");
							System.out.println("Enter your choice: ");
							int subpch1=sc.nextInt();
							switch(subpch1)
							{
								case 1:
									System.out.println("You have selected spicy butter paneer pizza.");
									break;
								case 2:
									System.out.println("You have selected Regualar sweet butter panner pizza.");
									break;
								case 3:
									System.exit(0);
									break;
								default:
									System.out.println("Invalid choice!!");
							}
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice!!");
					}
					break;			
				default:
					System.out.println("Invalid Choice!! please Try Again!!");
			}//end of switch
		}//end of while
	}
}