//version:1.0.0
//Purpose : Write a program to add two numbers
import java.util.*;
class Numberoperation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float num1,num2,add,subtract,multiply,division,modulus;
		System.out.print("Enter first number");
		num1=sc.nextFloat();
		System.out.print("Enter Second number");
		num2=sc.nextFloat();
		add=num1+num2;
		subtract=num1-num2;
		multiply=num1*num2;
		division=num1/num2;
		modulus=num1%num2;
		System.out.println("Addition is "+add);
		System.out.println("Substraction is "+subtract);
		System.out.println("Multiply is "+multiply);
		System.out.println("Division is "+division);
		System.out.println("Modulus is "+modulus);
	}
}