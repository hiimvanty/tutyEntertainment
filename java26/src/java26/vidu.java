package java26;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int out, in=0;
//		outer:	for(out=0; out< 10; out++) {
//					for(in =0; in< 20; in++) {
//						if( in>10)
//							break outer;
//					}
//					System.out.println("Vòng lặp bên trong: out= "+out+ "in= "+in);
//				}
//				System.out.println("Vòng lặp bên ngoài: out= "+out+ ", in= "+in);
//		StringBuffer searchMe = new StringBuffer("peter đừng làm như vậy nữa");
//		int max = searchMe.lenght();
//		int numPs = 0;
//		System.out.println(searchMe);
		int max=100;
		loop: for(int o=0; o<10; o++) {
			for(int i=0; i<max; i++) {
				if(i<50)
					continue loop;
				System.out.println(i);			
			}
			System.out.println("Kết thúc");
		}
			
		
	}

}
