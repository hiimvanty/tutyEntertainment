package java16;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số a: ");
		a = sc.nextDouble();
		
		System.out.println("Nhập vào số b: ");
		b = sc.nextDouble();
		
		// Ham gia tri tuyet doi
		System.out.println("|a|= " +Math.abs(a));
		
		// Ham tim min
		System.out.println("Min(a,b)= "+Math.min(a,b));
		
		// Ham tim max
		System.out.println("Max(a,b)= " +Math.max(a,b));
		
		// Ham tim ceil
		System.out.println("ceil(a)= " +Math.ceil(a));
		
		// Ham tim floor
		
		System.out.println("Floor(a)= " +Math.floor(a));
		
		// Ham can bac 2
		System.out.println("SQRT(a)= " +Math.sqrt(a));
		
		// Ham mu
		System.out.println("(a^b)= " +Math.pow(a,b));
		System.out.println("(b^a)= " +Math.pow(b,a));
		
		//
		double r, C, S;
		System.out.println("Nhập vào bán kính: ");
		r = sc.nextDouble();
		
		C=2*Math.PI*r;
		System.out.println("Chu vi hình tròn là: " +C);
		System.out.println("Chu vi làm tròn: " +Math.round(C*100.0)/100.0);
		
		S=Math.PI * Math.pow(r,2);
		System.out.println("Diện tích hình tròn là: " +S);
		System.out.println("Diện tích làm tròn: " +Math.round(S*100.0)/100.0);
		
		
		
		
	}

}
