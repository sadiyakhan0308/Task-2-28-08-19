public class Sbicard implements Atmcards 
{
	public void deposit() 
	{
		System.out.println("your account have been credited successfully in Sbi Bank");
	}

	public void withdraw() 
	{
		System.out.println("your account have been debited successfully in Sbi bank");
	}

	public void checkbalance() 
	{
		System.out.println("----------Your current balance is 20,000------");
	}

	public void ministatement() 
	{
		System.out.println("----------processed successfully please collect your slip ------");
	}
}
