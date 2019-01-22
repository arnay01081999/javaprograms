import java.util.Scanner;
public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input A:");//Enter the co-efficient of x^2
		int a = input.nextInt();
		System.out.print("Input B:");
		int b = input.nextInt();
		System.out.print("Input C:");
		int c = input.nextInt();
		double result = b*b-4.0*a*c;
		if(result>0.0)
		{
			double r1 = (-b + Math.pow(result,0.5))/(2.0*a);
			double r2 = (-b - Math.pow(result,0.5))/(2.0*a);
			System.out.println("The roots are " + r1 +"and"+ r2);
		}
		else if (result == 0.0)
		{
			double r1 = -b/(2.0*a);
			System.out.println("The roots are " + r1);
		}
		else
		{
			System.out.print("Irrational roots Hence No Solution");
		}
	}
}