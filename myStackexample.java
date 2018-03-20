/*Ashton Gibbs
*3/20/18
*CSC 234
*This program is an example of how to implement stack
*/


import java.util.Stack;
public class myStackexample
{
	public static void main(String[] args)
	{
	Stack<String> names = new Stack<String>();
	
	names.push("Samantha");
	names.push("Sam");
	names.push("bill");
	names.push("doug");
	
	System.out.println(names.peek());
	
	System.out.println(names);
	
	names.pop();
	
	System.out.println(names);
	
	System.out.println(names.search("Sam"));
}
 }