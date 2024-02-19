package Swiggy.com;

public class Swiggyapplication 
{
	public static void main(String[]args)
	{
		Swiggydrive s=new Swiggydrive();
		for(;;)
		{
			System.out.println("1.Login 2.Logout 3.Addhotel 4.Orederfood 5.Cancelfood 6.Displaybill 7.Removehotel 8.exit");
			switch(s.sc.nextInt())
			{
			case 1:
				s.Login();
				break;
			case 2:
				s.Logout();
				break;
			case 3:
				s.Addhotel();
				break;
			case 4:
				s.Orderfood();
				break;
			case 5:
				s.Cancelfood();
				break;
			case 6:
				s.Displaybill();
				break;
			case 7:
				s.Removehotel();
				break;
			case 8:
				return;		
			}
		}
	}
}


