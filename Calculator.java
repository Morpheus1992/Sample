//Documentation

//Program Author:
//Agustin Fleiderman
//CSC 3410
//April 1 2015

///Purpose
//The purpose of this problem is to create a calculator which takes an infix expression and converts it to a postfix
//expression or reverse polish notation. Once the calculator has done this it evaluates the sum to find what is the result of the 
//expression. The infix expression is gotten from the user when he put into the command prompt.  The program will then display the infix
//expression to the user and convert it to a postfix expression. Once it is converted to the program the value of x for the variable x the user
//has put in, the user will then put in this integer value of x and the program will calculate the result.

//Solution
//The first thing the program will do is make sure the user input the correct infix notation this will be done using scanner object.
//Then the program will trim the white spaces and make sure that no floating point number are put in using a char array. The infix expression the user
//put in will be stored in a string and then will be tokenized by operators and parentheses and the tones will be placed in an array of strings where the
//tokens will be kept and where they will be trimmed to eliminate white space. After this a for loop will be created and each String in the array of strings
//red will be send to a char a array c. Then the char array c will be analysed.
//The char array c is what will be used to created the postfix expression. The string where the postfix expression will be kept is called post.
//The character in the char array c called feo will be looked at if it found to be an letter or digit it will be placed in the post string.

//If the char is found to be an operator it will be or a ( parenthesis it will pushed on the stack. As the string is read if another operator is
//read it will be compared to the one in the stack if it is found to have equals or lower precedence the current operator in the stack
//will be added to the post fix string and popped and the operator currently in feo will be pushed on top of the stack. If the operator in char feo has a greater
//precedence than the one currently on top of the stack then it will be pushed onto the stack and become the new top char. Every time an operator is encountered
//a white space is added so that different number may be distinguished. 
// After this is done
//the string will be continued to be read if it encounters an ( parenthesis it will be pushed on the stack and all other operator will be continue to behave
//as they normally do until a ) parentheses is encountered. Eventually after this algorith is performed the function prefix will return the conversion from
//postfix to infix to the main method. 

//After the postfix is returned. The main method will ask what value x should have in the expression. If the user does not input a integer an integer value 
//the program will continue to prompt the user to put in an integer value until he does. If the user puts in a q then the program will exit and quit.
//The integer value the user puts in the function will be taken as a string. The program will then put in the postfix expression store in post and the value
//of x stored in string loco as argument to the method Calcular stored in the Object gordo an instance of the EvalPost class. After this is done
//then result of the postfix expression is Calculated by the EvalPost class. First the postfix expression is broken up into tokens with white space 
//being a delimiter between the tokens, then the tokens are stored in a string of array known as romeo and then a stack is created. After this a stack named 
//Pedro is created. The stack is where the operator will be kept. Now the array Romeo is analysed if the the string is Romeo does not equal an
//operator it is kept put into the stack then if the string stored in romeo equals an operator then the what is stored in pedro if popped and this forms the
//right value and then what is stored in pedro is popped and converted to an integer and this forms the left value for the operators then for example if the
//operator is + you do left + right value and stored this into an int named result. The variable result is converted to a string and
//then pushed into the stack. You have to created 2 int variable one to hold the left expression and the right expression.

//After this algorithm is performed the result of the postfix expression is obtained. The the reult sum is passed onto the variable answer
//and is displayed in the command prompt. 







import java.util.*;


public class Calculator
{
	public static void main(String[] args)
	{
		System.out.println("ENTER AN INFIX EXPRESSION");
		Scanner keyboard = new Scanner(System.in);
		String red = keyboard.nextLine(); //get the string red where the infix is keep
		Infix james = new Infix();
		String post;
		post=james.Prefix(red); //post is where the post fix string for the evaluation is kept
		System.out.println(post);
		EvalPost gordo = new EvalPost();
		
		String loco;
		do{
		System.out.println("enter the value of x please: or press q to exit ");
		 loco=keyboard.nextLine();
		 
		 if(loco.charAt(0) == 'q')
		 {
			System.out.println("you have chosen to exit the program");
			System.exit(0);
		 
		 }
		 for(int i=0;i<loco.length();i++)
		 {
			if(Character.isLetter(loco.charAt(i)) || loco.charAt(i) == '.' || loco.charAt(i) == '<' )
			{
				System.out.println("sorry sir you must enter an integer as a value of x");
				loco=keyboard.nextLine();
			
			}
		 
		 }
		
		 //this will give you the value of x which is loco
		int answer;
		//do the calculate method
		answer=gordo.Calcular(post, loco);//use the post string to find the answer
		System.out.println("the Result is : " + answer);
		
		}while(loco.charAt(0) != 'q');
		
		
		
	}


}