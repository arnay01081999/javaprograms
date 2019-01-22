import java.util.*;
class Rhombus
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int n,count1=1;count2=1;
		char ch='A';
		System.out.println("Enter the number of rows");
		n = sc.nextInt();
		for(int i=1;i<(n*2);i++)
		{
			for(int spc=n-count2;spc>0;spc--)
			{
				System.out.print(" ");
			}
			if (i<n)
			{
				count2++;
			}
			else
			{
				count2--;
			}
			for(int j=0;j<count1;j++)
			{
				System.out.print(ch);
				if(j<count1/2)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
			if(i<n)
			{
				count1=count1+2;
			}
			else
			{
				count1=count1-2;
			}
			ch='A';
			System.out.println();
		}
	}
}