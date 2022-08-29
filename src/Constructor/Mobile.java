package Constructor;
import java.util.Scanner;
public class Mobile
{
	String brand;
	String color;
	int ram;
	double price ;

	Mobile(String brand)
	{
		this.brand=brand;
	}
	Mobile(String brand,String color)
	{
		this(brand);
		this.color=color;
	}
	Mobile(String brand,String color,int ram)
	{
		this(brand,color);
		this.ram=ram;
	}
	Mobile(String brand,String color,int ram,double price)
	{
		this(brand,color,ram);
		this.price=price;
	}
    public void display()
	{
		System.out.println(brand+color+ram+"GB"+price);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  Brand Name");
		String brand=s.next();
		System.out.println("Enter color");
		String color=s.next();
		System.out.println("Enter RAM Size");
		int ram=s.nextInt();
		System.out.println("Enter price");
		double price=s.nextDouble();
		
	   Mobile m1=new  Mobile(brand,color);
			 m1.display();
	   Mobile m2=new Mobile(brand,color,ram,price);
	    m2.display();
	   }

}
