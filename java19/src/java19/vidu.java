package java19;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Nhập số nguyên từ 0 đến 8.");
		n = sc.nextInt();
		switch (n) {
			case 2:{
				System.out.println("Hôm nay là thứ 2");
				break;
			}
			case 3:{
				System.out.println("Hôm nay là thứ ba");
				break;
			}
			case 4:{
				System.out.println("Hôm nay là thứ tư");
				break;
			}
			case 5:{
				System.out.println("Hôm nay là thứ 5");
				break;
			}
			case 6:{
				System.out.println("Hôm nay là thứ 6");
				break;
			}
			case 7:{
				System.out.println("Hôm nay là thứ 7");
				break;
			}
			case 8:{
				System.out.println("Hôm nay là chủ nhật");
				break;
			}
			default:
				System.out.println("Nhập dữ liệu sai");
			}
	}

}
