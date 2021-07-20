package worker;

import java.util.*;
import java.util.List;

class Worker1{
	String name;
	//int salary;
public Worker1() {
		super();
		
	}

public Worker1(String name) {
		super();
		this.name = name;
	}
void show()
{
	System.out.println("Employee Name:"+name);
}


}



class DailyWorker extends Worker1{
	int r;
	
	public DailyWorker() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public DailyWorker(int r,String name) {
		super(name);
		this.r = r;
	}


	/*public DailyWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//int hour=40;*/

	public void pay(int hour)
	{
		//System.out.println(hour);
		show();
		System.out.println(r*hour);
	}
}
	

class SalariedWorker extends Worker1{
	int r;

	public SalariedWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public SalariedWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}*/

	public SalariedWorker(int r,String name) {
		super(name);
		this.r = r;
	}
	int h=40;
	void pay()
	{
		show();
		System.out.println(r*h);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Worker1> l=new ArrayList<>();
		DailyWorker d=new DailyWorker(300,"SG");
		SalariedWorker s=new SalariedWorker(400,"MG");
		DailyWorker d1=new DailyWorker(400,"SG");
		l.add(d);
		l.add(s);
		l.add(d1);
		
		d.pay(20);
		s.pay();
		d1.pay(25);

	}

}
