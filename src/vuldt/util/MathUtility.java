/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuldt.util;

/**
 *
 * @author SE141057
 */
public class MathUtility {

	// classs nay fake class Math cua jdk
	// math cua jdk co .abs() .sqrt() .sin() .PI
	// chung toan la static, vi la thu vien dung chung
	public static final double PI = 3.1415;

	//ham tính giai thua : n! = 1*2*3...n
	//0!=1! = 1
	// minh kh tinh duoc gia thua am
	//21! cuc lon tran kieu long chua kh noi
	// int toi da 2 ki tu 1 may
	// hàm tính fgiai thuwad trong giới hán đầu vào từ 0..20
	
//	public static long getFactorioal(int n) {
//		if (n < 0 || n > 20) {
//			throw new IllegalArgumentException("n must be between 0..20");
//		}
//		if (n == 0 || n == 1) {
//			return 1;
//		}
//		//ko sai else, co else tru diem
//		long result = 1;
//		//doan nay thi n =2-20;
//		for (int i = 2; i <= n; i++) {
//			result *= i;
//		}
//		return result;
//	}

	// Mình mimnh họa khái niệm refactoring - tối ưu code, chỉnh sửa lại code cho tốt hơn
	// và mình minh họa lkhais niệm regression tét, tét hồi quy tét lại những gì ddaxx từng tét xanh để check xem có như
	// ngày xưa không, sau khi đã sửa code 
	
	//viết đệ quy cho hoành traf́ng
	public static long getFactorioal(int n) {
		//gọi lại chính n=mình  với một quy mô khác 
		//đệ  quy rất dễ bị lặp vô tận 
		if(n<0 || n>20)
			throw new IllegalArgumentException("n must be between 0..20");
		if(n==0 || n==1)
			return 1; //dieu kien dung
		return n*getFactorioal(n-1);
	}
}
