package Constructor;
import java.util.Scanner;

public class School 
{
	String school_Name;
	School(String schoolName)
	{
		this.school_Name=school_Name;
	}
	Student c;
	public void addStudent(Student c)
	{
		if(this.c!=null)
		{
			System.out.println("student alredy present");
		}
		else
		{
			this.c=c;
					System.out.println("student added");	
		}
	}
	
	public void removeStudent()
	{
		if(c!=null)
		{
			c=null;
			System.out.println("Student Removed");
		}
		else
		{
			System.out.println("no student fonud");	
		}
	}
	public void updateStudent()
	{
		if(c!=null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name that to update");
			String new_name=s.next();
			c.setStudent(new_name)
			System.out.println(" Name is updated scessfully updated name is"+new_name);
		}
		else 
		{
			System.out.println("Student name no found");
		}
	}
	
	public void displayDetails()
	{
		if(c!=null)
		{
			System.out.println("c.getStudentName);
			System.out.println(c.getStudentId);
			System.out.println
		}
	}
	
	
}
