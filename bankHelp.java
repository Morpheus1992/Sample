import java.util.Random;
public class bankHelp
{
	private int RandomCustomer;
	 private int tellerTime;
	private int randomTeller;
	public bankHelp()
	{
	
	
	}
	
	public int Customer()
	{
		//creates a random # from two to six
		Random tupac = new Random();
		//returns a random # when the customers enters the bank and get into quene
		//every two to six seconds
		int RandomCustomer= 2 + tupac.nextInt(5); //using rand tupac
		RandomCustomer=RandomCustomer * 1000; // transform it into millseconds
		return RandomCustomer;

	}
	//the amount of time a customer spends with the teller and returns it in milliSeconds
	public  int CustomerTime()
	{
		Random grey = new Random();
		//now get the time spend with the teller which is two to five seconds
		int tellerTime = 2 + grey.nextInt(4);
		tellerTime=tellerTime*1000;
		
		return tellerTime; //the amount of time on spent with the customer
	
	}
	
	public  int Teller()
	{
		//creates a total of five tellers where the customer can goto
		Random biggie = new Random();
		int randomTeller= 0 + biggie.nextInt(5);
		 //from 0 to 4
		//return the random teller
		return randomTeller;
	}



}