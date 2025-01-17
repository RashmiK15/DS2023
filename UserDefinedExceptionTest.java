
public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		
		try {
		person.payingBill();
		
		}
		catch(NoBalanceException e) { //mandatory for checked exception
			System.out.println("Handler 1: "+e);
		}
		catch(LessBalanceForGroceryException e) { //not mandatory for unchecked exception
			System.out.println("Handler 2: "+e);
		}
		catch(LessBalForElectricityException e) { //not mandatory for unchecked exception
			System.out.println("Handler 3: "+e);
		}
		finally { //RUNS REGARDLESS OF THE EXCEPTION
			System.out.println("Finally all bills are cleared..");
		}
	}

}


class Person{
	
	
	void payingBill() throws NoBalanceException //since it is the mandatory checked exception
	{
		
		System.out.println("Paying Bill..");
		
		float bal = (float) (Math.random()*100);
		System.out.println("Bal: "+bal);
		
		if(bal<10) {
			NoBalanceException nbe = new NoBalanceException("No balanace in account");
			throw nbe;
		}
		
		else {
			
			if(bal>10 && bal<50) {
				LessBalanceForGroceryException lbge = new LessBalanceForGroceryException("Not enough money to pay groceries bill..");
				throw lbge;
			}
			if(bal<80) {
				
				LessBalForElectricityException lbe = new LessBalForElectricityException("Not enough money to pay electricity bill..");
				throw lbe;
			}
			else
			{
				System.out.println("Payment is over..");
			}
		}
	}
}

class NoBalanceException extends RuntimeException{
	
	public NoBalanceException(String message){
		super(message);
	}
}

class LessBalanceForGroceryException extends RuntimeException{
	
	public LessBalanceForGroceryException(String message) {
		super(message);
	}
}

class LessBalForElectricityException extends RuntimeException{
	
	public LessBalForElectricityException(String message) {
		super(message);
	}
}