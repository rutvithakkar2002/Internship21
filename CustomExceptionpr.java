//custom exception practice
//throw-->It helps to do custom exception
//throws-->method
//throwable-->parent class of all exception

//final-->var,class,methods
//constant
//finally-->block  always run or executed if error comes or not
//connection closing & file closing

//finalize-->garbage collector (release memory)
package internship22;

import java.util.Date;

class TuesdayNotoperational extends Exception {
	public TuesdayNotoperational(String msg) {
		super(msg);
	}
	/*
	 * void add() { this.x=2; super.addSuppressed(exception); }
	 */
}

public class CustomExceptionpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Date obj = new Date();
			// System.out.println(obj);
			String day = obj.toString().substring(0, 3);
//			System.out.println(obj.toString().substring(0,3));  //print seprate word
			if (day.equalsIgnoreCase("Tue")) {
				throw new TuesdayNotoperational("sorry , today is tuesday , Bank is closed");
			} else {
				System.out.println("Welcome Mr.Rutvi Thakkar your 1 crore is ready");
			}
		} // end of try

		catch (TuesdayNotoperational e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is finally..");
		}
	}
}

//this--->object of the same class
//super--->object of the parent class