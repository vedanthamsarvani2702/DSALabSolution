package com.DSALabSolution.Driver;
import java.util.Scanner;
import java.util.Stack;

public class Q1DriverApplication {
	public static void main(String args[])
	{
String expression;


Stack<Character> expressionStack=new Stack<Character>();

Scanner sc=new Scanner(System.in);
System.out.println("Enter the bracket string");
expression=sc.next();
boolean flag=true;
for(int i=0;i<expression.length();i++)
{
	char exp = expression.charAt(i);
	
	if(exp=='(' || exp=='[' || exp=='{')
	{
		expressionStack.push(exp);
		continue;
		
	}
    if(exp=='}')
	{
		char expPop=expressionStack.pop();
		if(expPop!='{')
		{
			flag=false;
			break;
			
			
			
		}
			
	}
    if(exp==')')
 	{
 		char expPop=expressionStack.pop();
 		if(expPop!='(')
 		{
 			flag=false;
 			break;
 			
 			
 			
 		}
 			
 	}
    if(exp==']')
 	{
 		char expPop=expressionStack.pop();
 		if(expPop!='[')
 		{
 			flag=false;
 			break;
 			
 			
 			
 		}
 			
 	}

		
}
if(flag) {
	System.out.println("The entered string has balanced brackets");
}
else

	System.out.println("The entered string doesn't have balanced brackets");


	
	}
}
