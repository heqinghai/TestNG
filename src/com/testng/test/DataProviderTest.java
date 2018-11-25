package com.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 数据驱动测试
 * 
 * @author hqh
 *
 */

public class DataProviderTest {

	@DataProvider(name = "test")
	public Object[][] user() {
		return new Object[][] { { "0", "a", "admin" }, { "1", "b", "bdmin" }, { "2", "c", "cdmin" },
				{ "3", "d", "ddmin" } };
	}

	@DataProvider(name = "test1")
	public Object[][][] name() {
		return new Object[][][] { { {} } };
	}

	@Test(dataProvider = "test")
	public void testCase(String id, String user, String password) {
		System.out.println("id: " + id + ",user: " + user + ",password: " + password);
		CommonApi.apiTest(id, user, password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
