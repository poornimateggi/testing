package encapulation;

import java.util.Scanner;

public class FacebookDrive
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter User Name");
	String fname=s.next();
	System.out.println("Enter User ID");
	int fid=s.nextInt();
	System.out.println("Enter password");
	String fpassword=s.next();
	Facebook f=new Facebook(fid,fname,fpassword);
	System.out.println(f.getFname());
	System.out.println(f.getFid());
	System.out.println("Ener the user name u want to change");
	String fname1=s.next();
	f.setFname(fname1);
	System.out.println("User name changed to "+fname1);
	}
}
