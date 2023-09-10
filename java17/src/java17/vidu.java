package java17;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,x;
		System.out.println("Nhập vào số a: ");
		a = sc.nextDouble();
		System.out.println("Nhập vào số b: ");
		b = sc.nextDouble();
		
		if(a%2==0) {
			System.out.println(a+ " là số chẵn");
		}else {
			System.out.println(a+ " là số lẽ");
		}
		
		//pt bậc 1
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			x=-b/a;
			System.out.println("Phương trình có nghiệm x= "+x);
		}
	}

}
