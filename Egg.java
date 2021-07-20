package week1;
import java.util.*;

public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of eggs");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int gross=n/144;
		n=n%144;
		int dozen=n/12;
		n=n%12;
		int num=n;
		System.out.println("Your no of eggs is"+gross+"gross,"+dozen+"dozen,"+"and"+num);
		
	}

}
