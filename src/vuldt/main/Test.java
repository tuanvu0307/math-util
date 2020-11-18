/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuldt.main;

import static vuldt.util.MathUtility.*;
// cau lenh khai bao san ham static khong can cham, y chang c, chi ap dung cho static

/**
 *
 * @author SE141057
 */
public class Test {
	public static void main(String[] args) {
		//ta test ham cua ta bang mat 
		long expected = 120; //ta mong nhan 120 neu goi ham 5!
		long actualt = getFactorioal(5);
		System.out.println("5! Expected: "+expected+"; Actual: "+actualt);
		
		//expected: 720 if tinh 6!
		System.out.println("6! Expected: "+expected+getFactorioal(6));
		
		//expected: 1 if tinh 0!
		System.out.println("0! Expected: "+expected+getFactorioal(0));
		
		//expected: IllegalArgumentExcaption if tinh -5
		System.out.println("-5! Expected: "+expected+getFactorioal(-5));
		
		//in thu xem coi co giong Math.PI kh?
		System.out.println("PI: "+PI);
		
		System.out.println("Goodbye and good luck to you all in the final exam");
		//muon ket luan ham minh ngon, thi ta phai nhin bang mat kets qua chay cua ham
		// va so sanh voi ki vong lam tung truong hop chay ham - test case
		//cach nay on nhing mat suc
		
		//Nang cao dung mau sac xanh do de ket luan
		//ta thays xanh, ham y moi tinh huong on
		//ta thay do, chi 1 thang do voi nhue ham toang
		//ta sai them 1 framework, unit test ten chung
		//junit, testing, nunit,...la nhung frameword cu the de giup test cac ham 1 cach hieeu qua
		//dung no ta tich hop vao mot quy trinh lam pham mem lon hon - CI/
	}
}
