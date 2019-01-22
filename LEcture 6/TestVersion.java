class Test
{
	int a,b;
	Test(int i,int j)
	{
		a=i;
		b=j;

	}
	void meth( 
		int a,int b)
	{
	a *=2;
	b /=2;
}
}
class CallByRefDemo
{
	public static void main(String[] args) 
	{
		Test ob = new Test(15,20);
		System.out.print("ob.a and ob.b before call"+ob.a+" "+ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call"+ob.a+" "+ob.b);
	}
}
