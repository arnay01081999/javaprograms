import java.util.*;
class PascalTriangle
{
	public static void main(String[] args) 
	{
		int r,i,k,number=1,j;
		char ch;
		ch='Y';
		Scanner scan = new Scanner(System.in);
		do
		{
		System.out.print("Enter Number of Rows : ");
		r=scan.nextInt();
		for(i=0;i<r;i++)
		{
			for(k=r;k>i;k--)
			{
				System.out.print(" ");
			}
			number=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}
		System.out.println("Do you want to try for other number(Y/N)");
		ch=scan.next().trim().charAt(0);
		if(ch=='Y'||ch=='y'||ch=='n'||ch=='N')
		{
			System.out.println("You entered "+ch);
		}
		else
		{
			System.exit(0);
		}
		}
		while(ch=='Y'||ch=='y');
	}
}