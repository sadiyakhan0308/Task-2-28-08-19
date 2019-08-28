public class AtmMachine 
{

	Atmcards atmcard;

	public void setatmcard(Atmcards atmcard) 
	{
		this.atmcard = atmcard;
	}

	public void withdraw() 
	{

		if (atmcard != null) 
		{
			atmcard.withdraw();
		} 
		else 
		{
			System.out.println("Please Insert your card");
		}
	}

	public void deposit() 
	{
		if (atmcard != null) 
		{
			atmcard.deposit();
		} 
		else 
		{
			System.out.println("Please Insert your card");
		}

	}

	public void checkbalance() 
	{
		if (atmcard != null) 
		{
			atmcard.checkbalance();
		}
		else 
		{
			System.out.println("Please Insert your card");
		}
	}

	public  void ministatement() 
	{
		if (atmcard != null) 
		{
			atmcard.ministatement();
		} 
		else 
		{
			System.out.println("Please Insert your card");
		}

	}

	public static void main(String args[]) 
	{
		AtmMachine atmmachine = new AtmMachine();
		atmmachine.setatmcard(new HdfcCard());
		// atmmachine.setatmcard(new Sbicard());
		atmmachine.withdraw();
		atmmachine.deposit();
		atmmachine.checkbalance();
		atmmachine.ministatement();
	}
}
