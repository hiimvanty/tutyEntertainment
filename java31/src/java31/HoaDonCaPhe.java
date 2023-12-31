package java31;
import java.util.Scanner;
	public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	public HoaDonCaPhe(String ten, double gia, double khoiLuong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = khoiLuong;
		
	}
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
		
	}
	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() >500;
	}
	public double giamGia(double x) {
		if(this.tinhTongTien()>500) {
			return (x/100)*this.tinhTongTien();
		}else {
			return 0;
		}
		
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
	
}