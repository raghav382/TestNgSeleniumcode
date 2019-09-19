package Package_Auto;

public class Interface1 {

	public static void main(String[] args) {
		raghuinterface r7=new interone();
		r7.display();
		

	}

}

interface raghuinterface
{
	public void display();
}

class interone implements raghuinterface
{
	public void display() 
	{
		System.out.println("this is interface");
	}
}


