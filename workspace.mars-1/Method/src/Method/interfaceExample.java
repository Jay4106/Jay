package Method;

public class interfaceExample  {

	public static void main(String[] args) {
		
		
		
		
		A obj = new A();
		obj.Hello();
		
		

	}
	
	interface Name {
		
		public void method();

		
	}


	 class A implements Name
	{
		
		public void Hello()
		{
			System.out.println("this is from Calss A-Hello");
		}
		
		public void method() 
		{
			System.out.println("this is from Interface");
		}
		
	}
	
	}
	

