import java.util.*;
class Comparefloat
{
	public static void main(String args[]) 
	{
		Scanner a=new Scanner(System.in);
		float number1;
		float number2;
		System.out.println("Enter the first number");
		number1 =a.nextFloat();
		System.out.format("Round off number upto 3 decimal places is %.3f\n",number1);
		System.out.println("Enter the second number you want to compare");
		number2 =a.nextFloat();
		System.out.format("Round off number upto 3 decimal places is %.3f\n",number2);
		int compare = Float.compare(number1,number2);
		if(compare>0)
		{
			System.out.println("Number 1 is greater");
		}
		else if (compare==0)
		{
			System.out.println("Both numbers are equal");
		}
		else 
		{
			System.out.println("Number 2 is greater");
		}
	}
}