class A 
{
	void Test1()
	
	{
		System.out.println("from test1() of class A");
	}
}
class B 
{
	void Test2()
	
	{
		System.out.println("from test2() of class B");
	}
}
class Tester1
{

	public static void main(String[] args)
	{
		System.out.println("The main starts....");
		B rv=new B();
		A rv1=new A();
		rv1.Test1();
		rv.Test2();
		System.out.println("The main ends....");



	}
}


