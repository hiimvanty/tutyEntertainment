package java13;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a;
		System.out.println("Nhập vào số a= ");
		a=sc.nextFloat();
		System.out.println("a= "+a);
		
		a +=3;
		System.out.println("a+=3 " +a);
		
		a-=2;
		System.out.println("a-=2 "+a);
		
		a*=3;
		System.out.println("a*=3 " +a);
	}

}
