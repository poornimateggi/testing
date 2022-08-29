package encapulation;
public class Bank {
	private String bank_name;//r
	private String bank_manager_name;//r/w
	private String branch;//r/w
	private String bank_head_office;//r
	Bank(String bank_name,String bank_manager_name,String branch,String bank_head_office)
	{
		this.bank_name=bank_name;
		this.bank_manager_name=bank_manager_name;
		this.branch=branch;
		this.bank_head_office=bank_head_office;
	}
	public String getBank_name()//r
	{
		return bank_name;
	}
	public String getBank_manager_name()//r
	{
		return bank_manager_name;
	}
	public void setBank_manager_name(String bank_manager_name)//w
	{
		this.bank_manager_name=bank_manager_name;
	}
	public String getBranch()//r
	{
		return branch;
	}
	public void setBranch(String branch)//w
	{
		this.branch=branch;
	}
	public String getBank_head_office()
	{
		return bank_head_office;}
	}
