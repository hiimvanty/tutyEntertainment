package java27;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0 ;
		try {
			System.out.println("Nhập vào n");
			n = sc.nextInt();	
		} catch(Exception e) {
			System.out.println("Nhập dữ liệu hhoong đúng");
		} finally {
			System.out.println("Finally!");
		}
		
		System.out.println("Giá trị nhập: "+n+".");
		System.out.println("kết thúc chương trình");
	}

}
