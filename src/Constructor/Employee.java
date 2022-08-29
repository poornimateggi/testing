package Constructor;
import java.util.Scanner;
public class Employee
{
	String ename;
	int eid;
	double esalary;
	long econ;
	Employee(String ename)
	{
		this.ename=ename;
	}
	Employee(String ename,int eid)
	{
		this(ename);
		this.eid=eid;
	}
	Employee(String ename,int eid, double esalary)
	{
		this(ename,eid);
		this.esalary=esalary;
	}
	Employee(String ename,int eid, double esalary,long econ)
	{
		this(ename,eid,esalary);
		this.econ=econ;
	}
    public void display()
	{
		System.out.println("Emaployee name: " +ename+" id:"+eid+" Contact number:"+econ+"Salary: "+esalary);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String ename=s.next();
		System.out.println("Enter Employee ID");
		int eid=s.nextInt();
		System.out.println("Enter Contact Number");
		long econ=s.nextLong();
		System.out.println("Enter salary");
		double esalary=s.nextDouble();
		
	   Employee e1=new Employee(ename,eid);
			 e1.display();
	   Employee e2=new Employee(ename,eid,esalary,econ);
			   e2.display();
	   }
}
