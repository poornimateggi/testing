package encapulation;
public class Facebook 
{
	private String fname;//r/w
	private int fid;//r
	private String fpassword;//w
	Facebook(int fid,String fpassword,String fname)
	{
		this.fid=fid;
		this.fname=fname;
		this.fpassword=fpassword;
	}
	public int getFid()
	{
		return fid;
	}
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setFpassword(String fpassword)
	{
		this.fpassword=fpassword;
	}
}