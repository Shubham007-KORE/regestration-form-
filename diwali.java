class diwali{
	private int price,quantity;
	private String pname;
	
	public void setdata(String nm,int pr,int qty)
	{
		pname=nm;
		price=pr;
		quantity=qty; 
	}
	public void showdata()
	{
		System.out.println("product name ="+pname);
	
		System.out.println("product Price ="+price);
		System.out.println("product Quantity ="+quantity);
	}
	
	public double bill()
	{
		double disc,fbill;
		double bill=price*quantity;
		System.out.println("before discount bill ="+bill);
		if(bill>=10000)
		{
			//double fb =bill*0.80; 
			disc=bill*0.20;							
			//double disc= bill*0.20;
			fbill=bill-disc;
			System.out.println("your discount bill is ="+fbill);
			System.out.println("your discount amoount is ="+disc);
					return fbill;

		}
		else
		{
			System.out.println("your bill is ="+bill);
		}
		return bill;
	}
}
class diwatest{
	public static void main(String[]args)
	{
		diwali d1;
		d1=new diwali();
		d1.setdata("shirt",2000,12);
		d1.showdata();
		double billd1=d1.bill();
		System.out.println("your bill is"+billd1);		
				System.out.println("  ");
		System.out.println("  ");

		
		diwali d2;
		d2=new diwali();
		d2.setdata("jens",2500,10);
		d2.showdata();
		double billd2=d2.bill();
		System.out.println("your bill is"+billd2);		
				System.out.println("  ");
		System.out.println("  ");

		diwali d3;
		d3=new diwali();
		d3.setdata("tv",4000,6);
		d3.showdata();
		double billd3=d3.bill();
		System.out.println("your bill is ="+billd3);		
		
		double billd=billd1+billd2+billd3;
		System.out.println("Final payment of 3 bill "+billd);

	}
}
	
	
	
	
	
	
	