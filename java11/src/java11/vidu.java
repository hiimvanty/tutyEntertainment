package java11;
import java.util.Scanner;
public class vidu {
	public static void main(String[] arg) {
		int a, b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập vào a: ");
		a = sc.nextInt();
		
		System.out.println("Nhập vào b:" );
		b = sc.nextInt();
		
		int tong= a+b;
		
		System.out.print(a+ "+" +b+ "=" +tong );
		
	}
}
