import java.util.Scanner; //import the scanner
import java.util.StringTokenizer;
import java.util.Stack;

import java.util.*;


public class Infix
{
	Stack loco = new Stack();
	
	 //create a scanner
		//now to create a stack
	public String Prefix(String gordo)
	{
				//Here is where the Program Begin	
			
			//type the the regular expression
			gordo="("+ gordo +")";
			String[] red;
			red=gordo.split("(?=[()+\\-*/])|(?<=[()+\\-*/])");
			System.out.println("THE EXPRESSION IN INFIX IS");
			
			for(int i=0;i<red.length;i++)
			{
				red[i]=red[i].trim(); //remove white spaces
				System.out.println(red[i]);
			}
			
			
			
			//now we will test out if what is stored is digit or character
			System.out.println("BREAKING IT ALL DOWN INTO A STRING OF CHARACTERS");
			String ramon;
			char[] c; //an array of characters
			char feo; // a single character
			//we will keep track of boolean operators flagg
			
			boolean operator=false; //see if an operator appears
			
			String post=""; //this is where the post fix expression will be put in
			
			char cono='n'; 
			//this is to hold the previous operator
			
		 //right parenthesis
			
			boolean dre; //this will determine if the infix if a character or digit 
			//here we is correcting errors
			//create a stack to check balanced parenthesis
			
			Stack <Character> agustin = new Stack(); //to  check left and right parenthesis
			//another stack to make sure the last char is not a operator
			
			Stack<Character> santiago =new Stack();
			
			// do it here 
			for(int check=0;check<red.length;check++)
			{
				ramon=red[check];
				c=ramon.toCharArray();
				
				//this does all the following thing
				for(int check2=0;check2<c.length;check2++)
				{
					feo=c[check2];
					santiago.push(feo);
					
					if(feo == '.')
					{
						System.out.println("error in expression cannot accept floating point numbers");
						System.exit(0);
					}
					if( (feo == '/' || feo == '+' || feo == '-' || feo == '*' || feo == '+' ) &&  operator == false)
					{
						operator=true;
						System.out.println(operator);
						cono=feo; //the operator that precedes 
						continue;
					
					}
					
					if((feo == '/' || feo =='+' || feo == '-' || feo == '*' || feo == '%') && operator == true)
					{
						System.out.println( feo+ "  cannot be preceded by " + cono);
						System.exit(0);
					
					}
					
					if(Character.isLetterOrDigit(feo) == true)
					{
						operator=false;
					
					}
					
					if( feo == '(')
					{
						agustin.push('('); //this will make sure left and right are equal
					
					}
					
					if( feo == ')')
					{
						agustin.pop();
					
					
					}
					
					
					
	
				}
			
			}
			
			if(agustin.empty() == false)
			{
				System.out.println("left and right parenthesis do not match, the program will exit");
				System.exit(0);
			
			}
			
			
			//if the last element in the infix expression is a operator program will exit
			
			santiago.pop();
			if(santiago.peek() == '+' || santiago.peek() == '-' || santiago.peek() == '/' || santiago.peek() == '%')
			{
				System.out.println("sorry the last token cannot be an operand");
				System.exit(0);
			
			
			}
			
			for(int i=0;i<red.length;i++)
			{
				
				ramon=red[i];
				c=ramon.toCharArray();
				
				for(int j=0;j<c.length;j++)
				{
					System.out.println(c[j]); //print what is stored in C
					feo=c[j];
					
					if(Character.isLetterOrDigit(feo) == true)
					{
						post=post+feo; //add character to string
					
					}
					else if( feo == '(' )
					{
						loco.push(feo); //using the stack
					}
					else if( feo == ')')
					{
						char look;
						post=post+ " "; //add some white space
						while((look = LookAt()) != '(')
						{
							post=post+look; //add it all in there
							post=post+" "; //put in some space
							PopIt();
						}
						loco.pop();
						
					}
					else
					{
						post=post+ " ";
						while(LaPrio(feo) <= LaPrio(LookAt()))
						{
							post=post+LookAt();
							post=post+" "; //add some space
							PopIt();
						
						}
						loco.push(feo); //push it the token
					}
				
				}
			}
			
			
				System.out.println("THIS IS THE POSTFIX EXPRESSION");
				return post;
				
	}
	
	
			//this will determine operator precedence 
			private int LaPrio(char operator)
			{
				if(operator == '/' || operator == '*' || operator == '%')
				{	
					return 2;
				}
				if(operator == '+' || operator == '-')
				{
					return 1;
				}
			
				return 0;
				
			}
			//this will do the associtivity 
			private  Character LookAt()
			{
				if( !loco.empty()) //if there no items it will return false plus ! make it true
				{
					return  (Character) loco.peek();
				}
				else
				return 0;
			
			
			}
			
			private  void PopIt()
			{
				if(!loco.empty())
				{
					loco.pop();
				}
			
			}
}