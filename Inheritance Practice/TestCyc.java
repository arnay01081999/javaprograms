class TestCyc
{
	public static void main(String [] args)
	{
		Cylinder c1=new Cylinder();
		System.out.println(c1.getcolor());
		System.out.println(c1.getradii());
        System.out.println(c1.getArea());
        System.out.println(c1.getvolume());

        Cylinder c2=new Cylinder();
        System.out.println(c2.setcolor("black"));
        System.out.println(c2.setradii(33));
        System.out.println(c2.getradii());
        System.out.println(c2.getvolume());
        System.out.println(c2.getArea());
	}
}