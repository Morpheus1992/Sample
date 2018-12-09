
import java.util.StringTokenizer;
import java.util.Stack; //import the stack
public class EvalPost
{

	//this method will return the sum of the postfix string 
	public int Calcular(String postFix, String value ) 
	{
		//create an an array made up of string to keep the tokens with white space as delimeters
		String[] romeo;
		romeo=postFix.split("\\s+");
		
		//print out the contents of romeo
		System.out.println("these are the tokens for the calculation");
		
		for(int i=0;i<romeo.length;i++)
		{
			if(romeo[i].equals("x"))
			{
				romeo[i]=value;
			
			}
		
		}
		
		System.out.println("this is what is stored now");
		
		for(int t=0;t<romeo.length;t++)
		{
			System.out.println(romeo[t]);
		
		}
		//now declare a stack
		Stack<String> pedro = new <String> Stack();
		String pepe; // this will hold the string in romeo[i]
		String angel;//this will will work with push and pop
		
		int result=0; //this will return result
		for(int k=0;k< romeo.length;k++)
		{
			pepe=romeo[k];
			if(pepe.equals("+"))
			{
				angel=pedro.pop();
				int right=Integer.parseInt(angel);
				angel=pedro.pop();
				int left=Integer.parseInt(angel);
				result=left+right; //convert result to a string
				String tupac;
				tupac=String.valueOf(result);
				pedro.push(tupac); //push the value of result here as string into the stack
			
			}
			else if ( pepe.equals("-"))
			{
				angel=pedro.pop();
				int right=Integer.parseInt(angel);
				angel=pedro.pop();
				int left=Integer.parseInt(angel);
				
				result=left-right; //subtract this shizzle
				String tupac=String.valueOf(result);
				pedro.push(tupac);
			
			}
			
			else if( pepe.equals("*"))
			{
				angel=pedro.pop();
				int right = Integer.parseInt(angel);
				angel=pedro.pop();
				int left= Integer.parseInt(angel);
				
				result=left * right;
				String tupac = String.valueOf(result);
				pedro.push(tupac);
			
			
			}
			
			else if( pepe.equals("%"))
			{
				angel=pedro.pop();
				int right=Integer.parseInt(angel);
				angel=pedro.pop();
				int left=Integer.parseInt(angel);
				result = left % right;
				
				String tupac = String.valueOf(result);
				pedro.push(tupac);
				
			}
			
			
			else if( pepe.equals("/"))
			{
				angel=pedro.pop();
				int right=Integer.parseInt(angel);
				angel=pedro.pop();
				int left=Integer.parseInt(angel);
				
				result=left / right;
				String tupac = String.valueOf(result);
				pedro.push(tupac);
			
			}
			
			
			else
			{
				pedro.push(pepe);
			
			}
		
		
		}
		return result;
	}
		


}