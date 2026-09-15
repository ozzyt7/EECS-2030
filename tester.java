package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class tester {

	@Test
	void test001() {
		int actualSpeed = -5;
		int maxSpeed = 10;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = -1;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test002() {
		int actualSpeed = 5;
		int maxSpeed = -10;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = -1;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test003() {
		int actualSpeed = -5;
		int maxSpeed = -3; 
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = -1;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test004() {
		int actualSpeed = 5;
		int maxSpeed = 10;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = -1;
		
		assertEquals(expect, result);
	}

	@Test
	void test005() {
		int actualSpeed = 49;
		int maxSpeed = 0;
		boolean isStuntDriving = true;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 6;
		
		assertEquals(expect, result);
	}
	
	
	@Test
	void test006() {
		int actualSpeed = 150;
		int maxSpeed = 100;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 6;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test007() {
		int actualSpeed = 200;
		int maxSpeed = 100;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 6;
		
		assertEquals(expect, result);
	}

	@Test
	void test008() {
		int actualSpeed = 70;
		int maxSpeed = 10;
		boolean isStuntDriving = true;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 6;
		
		assertEquals(expect, result);
	}

	@Test
	void test009() {
		int actualSpeed = 30;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 4;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test010() {
		int actualSpeed = 41;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 4;
		
		assertEquals(expect, result);
	}

	@Test
	void test011() {
		int actualSpeed = 49;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 4;
		
		assertEquals(expect, result);
	}

	@Test
	void test012() {
		int actualSpeed = 29;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 3;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test013() {
		int actualSpeed = 16;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 3;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test014() {
		int actualSpeed = 21;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 3;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test015() {
		int actualSpeed = 8;
		int maxSpeed = 0;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 0;
		
		assertEquals(expect, result);
	}

	@Test
	void test016() {
		int actualSpeed = 10;
		int maxSpeed = 10;
		boolean isStuntDriving = false;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 0;
		
		assertEquals(expect, result);
	}
	
	@Test
	void test017() {
		int actualSpeed = -5;
		int maxSpeed = -5;
		boolean isStuntDriving = true;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = -1;
		
		assertEquals(expect, result);
	}

	@Test
	void test18() {
		int actualSpeed = 56;
		int maxSpeed = 20;
		boolean isStuntDriving = true;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 6;
		
		assertEquals(expect, result);
	}
	
	
	@Test
	void test19() {
		int actualSpeed = 10;
		int maxSpeed = 10;
		boolean isStuntDriving = true;
		
		int result = TestingExample.LicencePoints(actualSpeed, maxSpeed, isStuntDriving);
		int expect = 0;
		
		assertEquals(expect, result);
	}

	

}
