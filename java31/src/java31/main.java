package java31;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100, 5.6);
		System.out.println("Tổng tiền: "+hd.tinhTongTien());
		System.out.println("Kiểm tra lớn khối lượng >2kg "+hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Số tiền có lớn hơn 500k không: "+hd.kiemTraTongTienLonHon500K());
		System.out.println("Giảm gia: "+hd.giamGia(10));
		System.out.println("Gia sau khi giam: "+hd.giaSauKhiGiam(10));
	}
	
	

}
 