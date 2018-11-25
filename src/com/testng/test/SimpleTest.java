package com.testng.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * TestNG单元测试框架执行流程：
 * 
 * BeforeSuite -> BeforeTest -> BeforeClass -> BeforeMethod1 -> Test1 ->
 * 
 * AfterMethod1 -> BeforeMethod2 -> Test2 -> AfterMethod2 -> AfterClass ->
 * 
 * AfterTest -> AfterSuite
 * 
 * @author hqh
 *
 */

public class SimpleTest {
	@Test(priority = 2)
	public void test1() {
		System.out.println("in @Test 1");
	}

	@DataProvider()
	@Test(priority = 1)
	public void test2() {
		System.out.println("in @Test 2");
		assertEquals(1 + 2, 4);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in @AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in @AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in @AfterSuite");
	}
}
