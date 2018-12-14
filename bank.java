



//Agustin Fleiderman
//CSC 3410
	///Purpose
//The purpose of this program is to be able to simulate a the running of a bank quene in java. That means
//simulating the a line of customers coming to a bank and interact with the tellers. The simulation will run for the two minutes
//and customers will arrive at the bank every 2 to 6 seconds and they will interact with the teller 2 to 5 seconds. The program will
//assign to each customer a teller. Once the program is finished running it will tell the total amount of customers that visited
//the bank every two minutes, the number of customers each teller helped, the total amount each teller was occupied
//the total amount of customers that did not get to see a teller.  To obtain the random number the random class will be used. The program will ask
//the user to run the simulation and will keep on asking until the user says no and then the program will end. If the user puts yes the bank will
//simulate the quene and then display all the various statistics.  The program will also state the number of customers the bank saw and was able to 
//serve during those two minutes.

	//Algorithms and solution
//The algorith that was used involved the array data structures as well as the queue data structure. The first thing that was 
//done was created a class to hold the methods necessary complete the simulation. The bank help class contained the method Customer to return
//a random number which simulates a customer entering the line at a bank every couple of seconds. The CustomerTime method uses a random number object
//to return a simulate time in milliseconds that the customer spent with the teller. The teller method returns an integer 0 through 4 to simulate randomly
//the teller a customer might go into. To begin the simulation the first thing that was done was to take the current time and put into a long variable
//start then after this a new variable called stop was created which took the current time and added it to 120,000 milliseconds which is two minutes.
//While start is less than stop the simulation ran using a while loop. While this while loop was working another loop was created called went which is start
//plus the Customer method which returns a the amount of time that must pass before a customer can enter the line of the bank. Once this
//time has passed a new customer symbolized by an integer was added into the bank queue. The passage of the time is shown by a loop in that while
//went is less that start time start time is incremented until it reaches a time nessesary to add a new customer to queue. 
//An array of boolean capacity five is created to represent the value of the teller if the values of teller is true then the teller is unoccupied
//and what is stored in the queue can be placed in another array called customer which determines whether there is a customer currently
//in the teller. While the simulation is running a random teller is chosen from the random number 0,1,2,3,4 to simulate one of the five tellers. Once
//this number is chosen  the variable x which holds this number is placed in the boolean teller array and if what this number references
//is true then that means that the teller is unoccupied and thus a new customer is added to it and the value that is number refferences is 
//set to false meaning that is occupied. After this what is stored in the agustin queue the integer is placed in the array customer in referenced by 
//x so if x equals one the boolean array 1 is set to false and in the customer array at one is set to the number placed in the queue by the customer that arrived.
//The variable totalCustomer is increment because a teller has served a customer. 
//The number placed in the quene is a one when a customer enters the bank.

//If the teller is currently occupied we search through the customer array which represent the customer interacting with the teller.

//If that the teller referenced by x is currently currently occupied, then we search through the entire customer array and what is stored in there. If what is
//stored in the int i where the for loop currently is does not equals zero and therefore is occupied then using the CustomerTime method the
//the amount of time that teller is occupied by adding the previous time the teller was occupied plus the amount the current time the customer
//spent with the teller this being calculated by the customerTime method. The variable severTeller is also incremented depending on what i is if 1 one
//then this mean that teller 1 was occupied it served a customer for a specific period of time and now serveTeller1 variable is incrmened because i has
//served a current customer.After this the boolean value at teller i is set to true meaning that customer has already been served and the teller is now
//unoccupied and that the array value customer is set to zero meaning that there is no customer currently in it. The else method thus effectively 
//free up a teller for use by a customer so that another customer in the quene can use it. 
	
	
	//Data structures
//The data structure used to hold the amount of customer in the line at the bank is the queue data structure. The queue holds all the customers
//that have yet to have business with a teller. The teller is represent by two parrallel array holding a a capacity of five. The boolean
//teller array determuines whether the array is currently occupied and the customer data array also is able to tell if the teller
//is currently occupied and it also is where the customer is placed when the an teller is free to be used.
//The quene was used to simulate a line because items are added at the tail of the list and are removed from the head of a list thus
//simulating the first one in first one out principle. 

	//Description of input/output
//The first the user is asked is if they want to run a simulation. If the user puts in yes. Then a simulation is run and the simulation
//tells the user how much time has passed along with how many people have been processed by a specific teller as well as how many
//the time period a certain teller has been occupied. The user must input yes to make the simulation run and must input no when they wish the simulation
//to no longer run.

	//Purpose of each class
//The bank class provide the main function which simulates the bank and how many customers each visit a specific teller. The
//bankHelp class assit the main class by providing method which create random numbers and help simulate the passage of time
//and how long each customers spends with a specific teller as well as how often a customer enters the bank and is ready
//to join the quene. 





import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
import java.util.Scanner;

public class bank
{
	
	
	public static void main(String[] args)
	{
	//creates the bank help object to help the customer
	
	bankHelp dre = new bankHelp();
	//create a quene to hold the customer in using the java library
	Queue<Integer> agustin = new LinkedList();
	
	//counts the total number of customer in two minutes
	int totalCustomers=0;
	//count the number of customers that go left out
	
	//now create variables to determines how long each teller was servicing a customer
	
	//so far the customers have not been served
	
	int left=0;
	
	//time each teller was servicing a customer
	int tellerOne=0;
	int tellerTwo=0;
	int tellerThree=0;
	int tellerFour=0;
	int tellerFive=0;
	
	//the number of customer each teller served
	int serveTeller1=0;
	int serveTeller2=0;
	int serveTeller3=0;
	int serveTeller4=0;
	int serveTeller5=0;
	
	//contains the number of customers each tellers served
	
	//create a boolean value to create the teller
	
	boolean[] tellers = new boolean[5];
	
	//the tellers are not occupied initially
	for(int i=0;i<tellers.length;i++)
	{
		tellers[i]=true; //store the values of the tellers in there
	
	}
	//TRUE MEANS UNOCCOUPIED
	for(int i=0;i<tellers.length;i++)
	{
		System.out.println(tellers[i]);
	
	}
	
		//this array will tell how long each customer spent with the teller
		//create a scanner object to make the program run
		int[] customer = new int[5]; 
		//initialize the array to zero
		
		for(int k=0;k<customer.length;k++)
		{
			customer[k]=0;
		
		
		}
		
		Scanner keyboard = new Scanner(System.in);
		boolean keep=true; //determines if the program
		
		int chico= dre.CustomerTime();
		int pico= dre.Teller();
		System.out.println("the value of pico is " + pico);
		System.out.println(chico);
		
		while(keep == true)
		{
			System.out.println("do you want to run the program enter yes or no");
			String input= keyboard.nextLine();
			input.trim();
			
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("the simulation is about to be begin (wait two minutes while it runs");
			
			
				
				
				
				//get the current time in milli seconds which is a thousand of a second
				long start=System.currentTimeMillis();
				System.out.println(start);
				//get the stopping time two minutes later
				long stop= start +120000;
			
			
				//now this will run the program until two minutes expired
				
				while(start <stop)
				{
					start=System.currentTimeMillis();
				
					//decide when a customer will enter a line
				
					long went= start + dre.Customer();
					
					//goes until customer enters the line
				
					while(start <went)
					{
						start=System.currentTimeMillis();
					
					}
					//a customer enters line line
					agustin.offer(2);
					
					//select a teller to assist a customer
					//the teller will assit the custome do stuff
					int x = dre.Teller();
					
					//check to see if that teller is occcupied
					
					if(tellers[x] == true)
					{
						//now the teller is assigned a customer
						tellers[x]=false;
						
						customer[x]=agustin.poll(); //remove from quene and store it there
						//increase the the number of customer served
						totalCustomers++;
					
					
					
					}
					
					else
					{
						//figures out how long a customer stays with a teller and then get rids of them
						
						for(int i=0; i<customer.length;i++)
						{
							//see if teller one has customer
							if(i == 0)
							{
								if(customer[0] != 0)
								{
									tellerOne=tellerOne+dre.CustomerTime();
									//add a customer to the teller
									serveTeller1++;
									//free the teller
									tellers[0]=true;;
									customer[0]=0;
								
								
								}
							}
								
								if( i == 1)
								{
										if(customer[1] != 0)
										{
										tellerTwo=tellerTwo+dre.CustomerTime();
										//add a customer to the teller
										serveTeller2++;
										//free the teller
										tellers[1]=true;
										customer[1]=0;
								
										}
								
								
								}
								
									//determines if third teller is free
									if(i == 2)
								{
										if(customer[2] != 0)
										{
											tellerThree=tellerThree+dre.CustomerTime();
											//add a customer to the teller
											serveTeller3++;
											//free the teller
											tellers[2]=true;
											customer[2]=0;
								
										}
								
								}
								
								
									if(i == 3)
									{
										//see if anycustomer is in teller
										if(customer[3] != 0)
										{
											tellerFour= tellerFour + dre.CustomerTime();
											//add a customer to the teller
											serveTeller4++;
											tellers[3]=true;
											customer[3]=0;
										}
									
									
									}
									
									
									if(i ==4)
									{
										if(customer[4] !=0)
										{
											tellerFive= tellerFive + dre.CustomerTime();
											serveTeller5++;
											tellers[4]=true;
											customer[4]=0;
										
										
										}
									
									
									
									}
								
						}
								
					}
					 //Prints results after 2min. Total occpuied time from each teller
					System.out.println("teller 1 total occupied time: "+tellerOne/1000+"sec");
					System.out.println("teller 2 total occupied time: "+tellerTwo/1000+"sec");
					System.out.println("teller 3 total occupied time: "+tellerThree/1000+"sec");
					System.out.println("teller 4 total occupied time: "+tellerFour/1000+"sec");
					System.out.println("teller 5 total occupied time: "+tellerFive/1000+"sec");

					System.out.println();

					//Prints results after 2min. Total customer count from each teller
					System.out.println("teller 1 CUSTOMERS "+serveTeller1);
					System.out.println("teller 2 CUSTOMERS : "+serveTeller2);
					System.out.println("teller 3 CUSTOMERS: "+serveTeller3);
					System.out.println("teller 4 CUSTOMERS "+serveTeller4);
					System.out.println("teller 5 CUSTOMERS "+serveTeller4);
				

				}
				
				System.out.println("teller 1 total occupied time: "+tellerOne/1000+"sec");
				System.out.println("teller 2 total occupied time: "+tellerTwo/1000+"sec");
				System.out.println("teller 3 total occupied time: "+tellerThree/1000+"sec");
				System.out.println("teller 4 total occupied time: "+tellerFour/1000+"sec");
				System.out.println("teller 5 total occupied time: "+tellerFive/1000+"sec");

			System.out.println();

			//Prints results after 2min. Total customer count from each teller
				System.out.println("teller 1 CUSTOMERS "+serveTeller1);
				System.out.println("teller 2 CUSTOMERS : "+serveTeller2);
				System.out.println("teller 3 CUSTOMERS: "+serveTeller3);
				System.out.println("teller 4 CUSTOMERS "+serveTeller4);
				System.out.println("teller 5 CUSTOMERS "+serveTeller4);
				
				System.out.println();
				
				System.out.println("TOTAL AMOUNT OF CUSTOMERS IS " + totalCustomers);
				//check to see which customers where not helped
				  for(int i=0; i<customer.length; i++){
					left += customer[i];
					System.out.println("the number of customers not helped is :" + left);
        }

			}
				
			
				else if(input.equalsIgnoreCase("no"))
				{
					System.out.println("the program will now exit");
					keep=false;
			
				
				}
			}
				
				//the results will be printed out once the thing is expired
				
		}
			
			
		
		
		
}

	

	
	



