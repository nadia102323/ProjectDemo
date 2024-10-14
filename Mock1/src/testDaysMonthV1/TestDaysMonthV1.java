package testDaysMonthV1;

import static org.junit.Assert.*;
import org.junit.Test;

import daysmonthV1.*;

public class TestDaysMonthV1 {

	// Add your answer to the four test cases for Q1
	@Test
	public void testQ1_1() {
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new
		DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(10, 0);
		assertEquals(-1, result);
	}

	@Test
	public void testQ1_2() {
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new
		DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(3, 2024);
		assertEquals(31, result);
	}

	@Test
	public void testQ1_3() {
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new
		DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(6, 2024);
		assertEquals(30, result);
	}

	@Test
	public void testQ1_4() {
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new
		DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(13, 2024);
		assertEquals(-2, result);

	}

	// Add your answer to the two test cases for Q2
	@Test
	public void testQ2_1() {

	}

	@Test
	public void testQ2_2() {

	}

	// Add your answer to the two test cases for Q3
	@Test
	public void testQ3_1() {

	}

	@Test
	public void testQ3_2() {

	}
}
