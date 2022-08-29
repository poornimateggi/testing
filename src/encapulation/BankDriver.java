package encapulation;

import java.util.Scanner;

public class BankDriver 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank_name=s.next();
		System.out.println("Enter Bank Manager Name");
		String bank_manager_name=s.next();
		System.out.println("Enter Branch");
		String branch=s.next();
		System.out.println("Enter Bank Head office ");
		String bank_head_office=s.next();
		Bank b=new Bank(bank_name,bank_manager_name,branch,bank_head_office);
		System.out.println(b.getBank_name());
		System.out.println(b.getBank_manager_name());
		System.out.println(b.getBranch());
		System.out.println(b.getBank_head_office());
		
		System.out.println("Enter the bank manager name u want to change");
		String bank_manager_name1=s.next();
		b.setBank_manager_name(bank_manager_name1);
		System.out.println("Bank manager name changed to "+bank_manager_name1);
		
		System.out.println("Enter the Branch name u want to change");
		String branch1=s.next();
		b.setBranch(branch1);
		System.out.println("Bank Branch name changed to "+branch1);
		
}
}