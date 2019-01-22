import java.util.*;
class BoxDemo
{
	public static void main(String[] args) 
	{
		Box a =new Box();
		double vol1=a.volume();
		Box b =new Box(1,2);
		double vol2=b.volume();
		Box c =new Box(1,2,3);
		double vol3=c.volume();
		System.out.println("Volume 1\t" +vol1);
		System.out.println("Volume 2\t" +vol2);
		System.out.println("Volume 3\t" +vol3);
	}
}