import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào họ và tên: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã sinh viên: ");
		long maSV =sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		double diem =sc.nextDouble();
		
		System.out.println("Họ và tên: "+hoVaTen);
		System.out.println("Mã sinh viên: "+maSV);
		System.out.println("Điểm: "+diem);
		
		
	}
}
