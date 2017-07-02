import java.util.Scanner;

class Person
{
	int age=10;
	double height=5.6;
	
	public void display()
	{
		System.out.print(age+"  :  "+height);
	}
}
class MyClass
{
   public static void main(String [] args)
   {
	 Person k = new Krishna();   
	 k.show();
	
   }
}
class Krishna  extends Person
{
	String color="Blue";
	int weight=50;
	
	public void show()
	{    display();
		System.out.println(" : "+color+" : "+(weight+height));
	}
	
}
