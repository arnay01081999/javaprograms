import java.util.*;
class TestVec{
public static void main(String []args){

	Scanner scan =new Scanner(System.in);
	System.out.println("the 2-bike,4-car");
	int ch=scan.nextInt();
	
	switch(ch)
	{
	case 2:
	Bike b=new Bike();
    break;

	case 4:
	Car b1=new Car();
	break;

	}

}}