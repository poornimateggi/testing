package Constructor;

public class Student 
{
	private String studentName;//r/w
	private int studentId;//r
	private int studentAge;//w
	Student(String studentName,int studentId,int studentAge)
	{
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentAge=studentAge;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public int  getStudentId()
	{
		return studentId;
	}
	public int  getStudentAge()
	{
		return studentAge;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
}
