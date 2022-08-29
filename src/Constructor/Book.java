package Constructor;

public class Book 
{
String bname;
int bid;
int no_of_page;
Book(String bname)
{
	this.bname=bname;
}
Book(String bname,int bid)
{
	this(bname);
	this.bid=bid;
}
Book(String bname,int bid, int no_of_page)
{
	this(bname,bid);
	this.no_of_page=no_of_page;
}
public void display()
{
	System.out.println(bname+ " "+bid+ "   "+no_of_page);
}
public static void main(String[] args)
{
	Book b=new Book("kannada",2,78);
	b.display();
}
}