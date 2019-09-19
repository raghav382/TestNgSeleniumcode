package Package_Auto;

public class DemoInheritance {

	public static void main(String[] args) {
		child1 gh=new child1();
		int y=gh.ParentMethod(20, 50);
		System.out.println("Main program output by taking return value\n");
		int w=y*9;
		System.out.println(w);
		gh.ChildMethod();
	}
	
}
	 class parent
	{
		public int ParentMethod(int a, int b)
		{
		 int i;
		
		i=a+b;
		System.out.println("Method fromo Parent class\n");
		System.out.println(i);
		return(i);
		}
	}
	 class child1 extends parent
	 {
		 
		public void ChildMethod()
		{
			int k,u=4,i=9;
			k=u+i;
			System.out.println("Method from Child class\n");
			System.out.println(k);
		}
	 }