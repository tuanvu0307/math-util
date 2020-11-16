/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuldt.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static vuldt.util.MathUtility.getFactorioal;


/**
 *
 * @author SE141057
 */
public class MathUtilityTest {
	
	@Test //@Test se bien ham nay thanh public static vois main()
	//cach dat ten ham se noi len muc tieu test ham co nhieu ui tac dat ten ham test
	public void getFactorial_RunsWell_IfValidArgument(){
		assertEquals(120, getFactorioal(5));
		assertEquals(1, getFactorioal(0));
	}
	@Test(expected = IllegalArgumentException.class)
	public void getFactorial_ThrowsException_IfInvalidArgument(){
		getFactorioal(-5);
	}
	
}
