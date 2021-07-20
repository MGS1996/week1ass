package week1;
import java.util.*;

public class Calculate {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gender:");
		String s=sc.next();
		System.out.println("Enter the income:");
		int amount=sc.nextInt();
		int tax=0;
		if(s.equals("general"))
		{
			
			if(amount<=180000)
				tax=0;
			else if(amount>180000 && amount<=500000)
				tax=(amount*10)/100;
			else if(amount>500000 && amount<=800000)
				tax=(amount*20)/100;
			else
				tax=(amount*30)/100;
		}
		else if(s.equals("women"))
		{
			if(amount<=190000)
				tax=0;
			else if(amount>190000 && amount<=500000)
				tax=(amount*10)/100;
			else if(amount>500000 && amount<=800000)
				tax=(amount*20)/100;
			else
				tax=(amount*30)/100;
		}
		else
			System.out.println("Enter gender Correctly");
		System.out.println(tax);
	}

}
