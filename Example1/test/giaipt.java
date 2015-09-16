/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huy
 */
public class giaipt {
   GiaiPTBac2 phuongTrinh = new GiaiPTBac2();
	double a = -111;
	double b = 111;
	@Test
	public void testPhuongTrinhBacNhat() {
		double[] nghiem = phuongTrinh.giaipt(0, 1, 2);
		assertEquals(-2.0, nghiem[0], -2.0);
		assertEquals(a, nghiem[1], 1);
	}
	
	@Test
	public void testPhuongTrinhVoNghiem() {
		double[] nghiem = phuongTrinh.giaipt(1, 2, 3);
		assertEquals(a, nghiem[0], 1);
		assertEquals(a, nghiem[1], 1);
	}

	@Test
	public void testPhuongTrinhVoSoNghiem() {
		double[] nghiem = phuongTrinh.giaipt(0, 0, 0);
		assertEquals(b, nghiem[0], 1);
		assertEquals(b, nghiem[1], 1);
	}
	
	@Test
	public void testPhuongTrinhNghiemKep() {
		double[] nghiem = phuongTrinh.giaipt(1, 2, 1);
		assertEquals(-1.0, nghiem[0], 0.001);
		assertEquals(a, nghiem[1], 0.001);
	}
	
	@Test
	public void testPhuongTrinhHaiNghiem() {
		double[] nghiem = phuongTrinh.giaipt(2, -3, 1);
		assertEquals(1.0, nghiem[0], 1.0);
		assertEquals(0.5, nghiem[1], 0.1);
	}
}
