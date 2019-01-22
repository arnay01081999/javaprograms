import java.util.*;
class Digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,size,large=-1;		
		System.out.print("Enter FIVE digit number : ");
		num=sc.nextInt();
		size=Integer.valueof(num).length(num);
		if(size!=5)
		{
			System.out.println("WRONG INPUT");
		}
	}
}