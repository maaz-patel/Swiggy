package Swiggy.com;
import java.util.Scanner;

public class Swiggydrive 
{
	Scanner sc=new Scanner(System.in);
	Account a;
	Hotel h;
	
	public void Login()
	{
		if(a==null)
		{
			System.out.println("enter usernmae");
			String username=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			System.out.println("enter address");
			String address=sc.next();
			System.out.println("enter contactno");
			long contactno=sc.nextLong();
			System.out.println("enter mail");
			String mail=sc.next();
			
			a=new Account(username,password,address,contactno,mail);
			System.out.println("account login successfully");
			
			
			
		}
		else
		{
			System.out.println("your already login");
			
		}
	}
	
	public void Logout()
	{
		if(a==null)
		{
			System.out.println("your are not login");
		}
		else
		{
			a=null;
			System.out.println("logout successfully");
		}
	}
	
	public void Addhotel()
	{
		if(a==null)
		{
			System.out.println("your are not login");
		}
		else
		{
			if(h==null)
			{
				System.out.println("1.Veg 2.Non veg");
				switch(sc.nextInt())
				{
				case 1:
					h=new Veg();
					System.out.println("you choose veg");
					break;
				case 2:
					h=new Nonveg();
					System.out.println("you choose nonveg");
					break;
				}
			}
			else
			{
				System.out.println("you already choosed hotel");
				
			}
		}
	}
	
	public void Removehotel()
	{
		if(h==null)
		{
			System.out.println("you not added hotel please add hotel");
		}
		else
		{
			h=null;
			System.out.println("hotel is removed");
		}
	}
	
	public void Orderfood()
	{
		if(a==null)
		{
			System.out.println("please Login to order");
		}
		else
		{
			if(h==null)
			{
				System.out.println("please add hotel first");
			}
			else
			{
				if(h instanceof Veg)
				{
					Veg v=(Veg)h;
					System.out.println("1."+" "+v.food1+"-----"+v.food1price);
					System.out.println("2."+" "+v.food2+"-----"+v.food2price);
					System.out.println("3."+" "+v.food3+"-----"+v.food3price);
					System.out.println("4."+" "+"Thank you");
					for(;;)
					{
						switch(sc.nextInt())
						{
						case 1:
							System.out.println("how many"+" "+v.food1);
							 v.qytoffood1=sc.nextInt();
							break;
						case 2:
							System.out.println("how many"+" "+v.food2);
							v.qytoffood2=sc.nextInt();
							break;
						case 3:
							System.out.println("how many"+" "+v.food3);
							v.qytoffood3=sc.nextInt();
							break;
						case 4:
							System.out.println("Thank you please bring our order");
							return;
							
						}
					}
				}
				
				else if(h instanceof Nonveg)
				{
					Nonveg v=(Nonveg)h;
					System.out.println("1."+" "+v.food1+"-----"+v.food1price);
					System.out.println("2."+" "+v.food2+"-----"+v.food2pricehalf+"/"+v.food2pricefull);
					System.out.println("3."+" "+v.food3+"-----"+v.food3price);
					System.out.println("4."+" "+v.food4+"-----"+v.food4price);
					System.out.println("5."+" "+v.food4+"-----"+v.food5price);
					System.out.println("6."+" "+"Thank you");
					for(;;)
					{
						switch(sc.nextInt())
						{
						case 1:
							System.out.println("how many"+" "+v.food1);
							v.qytoffood1=sc.nextInt();
							break;
						case 2:
							System.out.println("how many"+" "+v.food2);
							v.qytofhalffood2=sc.nextInt();
							v.qytoffullfood2=sc.nextInt();
							break;
						case 3:
							System.out.println("how many"+" "+v.food3);
							v.qytoffood3=sc.nextInt();
							break;
						case 4:
							System.out.println("how many"+" "+v.food4);
							v.qytoffood4=sc.nextInt();
							break;
						case 5:
							System.out.println("how many"+" "+v.food5);
							v.qytoffood5=sc.nextInt();
							break;
						case 6:
							System.out.println("Thank you please bring our order");
							return;
							
						}
					}
				}
			}
	
		}
	}
	
	public void Cancelfood()
	{
		if(h==null)
		{
			System.out.println("you not order food");
		}
		else
		{
			h=null;
			System.out.println("order is cancelled");
		}
	}
	
	public void Displaybill()
	{
		if(h==null)
		{
			System.out.println("you not order anything");
		}
		else
		{
			if(h instanceof Veg)
			{
				Veg v=(Veg)h;
				double sum=0;
				if(v.qytoffood1!=0)
				{
					System.out.println(v.food1+" "+v.qytoffood1+" ="+v.qytoffood1*v.food1price);
					sum=(sum+(v.qytoffood1*v.food1price));
				}
				if(v.qytoffood2!=0)
				{
					System.out.println(v.food2+" "+v.qytoffood2+" ="+v.qytoffood2*v.food2price);
					sum=(sum+(v.qytoffood2*v.food2price));	
				}
				if(v.qytoffood3!=0)
				{
					System.out.println(v.food3+" "+v.qytoffood3+" ="+v.qytoffood3*v.food3price);
					sum=(sum+(v.qytoffood3*v.food3price));
				}
				System.out.println("Your bill="+sum);
				System.out.println("enter amount");
				double money=sc.nextDouble();
				
				if(money>=sum)
				{
					System.out.println("payement successful.Thank you");
					h=null;
				}
				else
				{
					System.out.println("Payement not done");
				}
			}
			
			else if(h instanceof Nonveg)
			{
				Nonveg v=(Nonveg)h;
				double sum=0;
				if(v.qytoffood1!=0)
				{
					System.out.println(v.food1+" "+v.qytoffood1+" ="+v.qytoffood1*v.food1price);
					sum=(sum+(v.qytoffood1*v.food1price));
				}
				if(v.qytofhalffood2!=0||v.qytoffullfood2!=0)
				{
					System.out.println(v.food2+" "+v.qytofhalffood2+" ="+v.qytofhalffood2*v.food2pricehalf);
					System.out.println(v.food2+" "+v.qytoffullfood2+" ="+v.qytoffullfood2*v.food2pricefull);
					sum=(sum+(v.food2pricehalf*v.qytofhalffood2));	
					sum=(sum+(v.food2pricefull*v.qytoffullfood2));
				}
				if(v.qytoffood3!=0)
				{
					System.out.println(v.food3+" "+v.qytoffood3+" ="+v.qytoffood3*v.food3price);
					sum=(sum+(v.qytoffood3*v.food3price));
				}
				if(v.qytoffood4!=0)
				{
					System.out.println(v.food4+" "+v.qytoffood4+" ="+v.qytoffood4*v.food4price);
					sum=(sum+(v.qytoffood4*v.food4price));
				}
				if(v.qytoffood5!=0)
				{
					System.out.println(v.food5+" "+v.qytoffood5+" ="+v.qytoffood5*v.food5price);
					sum=(sum+(v.qytoffood5*v.food5price));
				}
				System.out.println("Your bill="+sum);
				System.out.println("enter amount");
				double money=sc.nextDouble();
				
				if(money>=sum)
				{
					System.out.println("payement successful.Thank you");
					h=null;
				}
				else
				{
					System.out.println("Payement not done");
				}
			}
		}		
	}	
}
