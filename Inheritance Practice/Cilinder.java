class Cyclinder extends Circle{
	private double height;
	Cyclinder()
	{   super();
		height=1.0;
        
	}
	Cyclinder (double radii)
	{
		super(radii);
		this.height=1.0;

	}
	Cyclinder(double radii,double height)
	{
		super(radii);
		this.height=height;

	}
	Cyclinder(double radii,double height,String color)
	{
		super(radii,color);
		
		this.height=height;

	}
	double getHeight()
	{
		return this.height;
	}
	void setHeight(double height )
	{
		this.height=height;

	}
	double getvolume()
	{ double vol;
      vol=getArea()*height;
      return vol;
	}


}