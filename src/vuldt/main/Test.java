/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuldt.main;

import vuldt.util.MathUtility;

/**
 *
 * @author SE141057
 */
public class Test {
	public static void main(String[] args) {
		//ta test ham cua ta bang mat 
		long expected = 120; //ta mong nhan 120 neu goi ham 5!
		long actualt = MathUtility.getFactorioal(5);
		System.out.println("5! Expected: "+expected+"; Actual: "+actualt);
		
		//expected: 720 if tinh 6!
		System.out.println("6! Expected: "+expected+MathUtility.getFactorioal(6));
		
		//expected: 1 if tinh 0!
		System.out.println("0! Expected: "+expected+MathUtility.getFactorioal(0));
		
		//expected: IllegalArgumentExcaption if tinh -5
		System.out.println("-5! Expected: "+expected+MathUtility.getFactorioal(-5));
	}
}
