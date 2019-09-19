package Package_Auto;
//import DemoPack1.*;
public class Demo1 {

	public static void main(String[] args) {
System.out.println("This is begenning \n");
raghu3 r1=new raghu3();
//raghu3 r2= new raghu3(5,5,"This is Bhuvvi\t");
//int y=r1.raghu3(3,4,6);
//System.out.println(y);
one o1=new one();
one.raghu();
int g=o1.raghu1(12, 34);
System.out.println(g+2);
o1.raghu1(3,5);
democlass3self s1=new democlass3self();
s1.bangalore();
democlass2 s3=new democlass2();
s3.chennai();
	}

}

class raghu3
{
	raghu3(int a, int b, String c)
	{
		int r=a+b;
		System.out.println("Constructor \n " +c + r);
		//return r;
	}
	
	raghu3()
	{
		System.out.println("This is constructor raghu3 \n");
	}
}
class one extends two
{
	public static void raghu()
	{
		System.out.println("this is first");
	}
}

class two
{
	public int raghu1(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
}