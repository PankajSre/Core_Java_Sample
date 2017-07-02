class ExceptionTest
{
   public static void main(String [] my)
   {
	  try{
	   System.out.println("Start");
	   int a=Integer.parseInt(my[0]);//1 & 2
	    System.out.println("One");
		int b=10/(a-5);//3
		System.out.println("Two");
		
		String name="Krishna";
		name=null;
		System.out.println("Three");
		System.out.println(name.length());//4
		System.out.println("end"); 
	  }
	  catch(ArrayIndexOutOfBoundsException ex)
	  {
		  System.out.println("Provide a Number at Run Time");
	  }
	   catch(NumberFormatException ex)
	  {
		  System.out.println("Please Provide a Number Only");
	  }
	   catch(ArithmeticException ex)
	  {
		  System.out.println("You are Dividing a Number by ZERO");
	  }
	   catch(NullPointerException ex)
	  {
		  System.out.println("Reference Variable is Pointing to NULL");
	  }
	  finally
	  {
		  System.out.println("I must be executed.........");
	  }
	   
   }
}