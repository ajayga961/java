import java.util.*;
class EX2
{
	ArrayList<String> a=new ArrayList<String>();
	void append(String c)
	{
		a.add(c);
	}
	void insert(int p,String c)
	{
		a.add(p,c);
	}
	boolean search(String c)
	{

		return a.contains(c);
	}
	void display()
	{
		System.out.println(a.toString());
	}
	public static void main(String arg[])
	{
		EX2 obj=new EX2();
		while(true)
		{
			System.out.println("1.append");
			System.out.println("2.insert");
			System.out.println("3.search");
			System.out.println("4.display");
			System.out.println("5.Exit:");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter city name");
				obj.append(s.next());
				break;
			case 2:
				System.out.println("Enter position");
				int a=s.nextInt();
				System.out.println("Enter city name");
				String b=s.next();
				obj.insert(a,b);
				break;
		        case 3:
				System.out.println("Enter for search");
				System.out.println(obj.search(s.next()));
				break;
			case 4:
				obj.display();
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid day");
				}}}}

 