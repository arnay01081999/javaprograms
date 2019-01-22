class Circle
{
private double radii;
private String color;
Circle()
{
	this.radii=1.0;
	this.color="Red";

}

Circle(double radii,String color)
{
	this.radii=radii;
	this.color=color;

}
Circle(double radii)
{
	this.radii=radii;
    this.color="Red";
}
double getradii()
{
	return radii;

}
String getcolor()
{
	return  color;

}
void setcolor(String color)

{
   this.color=color;

}
void  setradii(double radii)
{
	this.radii=radii;


}


double getArea()
{
	double area=3.14*radii*radii;
	return area;
}
}