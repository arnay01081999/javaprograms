import java.util.*;
class Box
{
		Scanner scan=new Scanner(System.in);
		double width;
		double height;
		double depth;
		Box()
		{
			width=1;
			height=1;
			depth=1;
		}
		Box(double w,double h,double d)
		{
			this.width=w;
			this.height=h;
			this.depth=d;
		}
		Box(double w,double d)
		{
			this.width=w;
			height=2;
			this.depth=d;
		}
		void setDim()
		{
			width =scan.nextInt();
			height=scan.nextInt();
			depth=scan.nextInt();
		}
		double volume()
		{
			return (width*height*depth);
		}
}