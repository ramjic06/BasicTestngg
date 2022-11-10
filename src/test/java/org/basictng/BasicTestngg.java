package org.basictng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicTestngg {

	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Test
	private void test() {
		System.out.println("test");
	}
	
	@Test
	private void gitnew() {
		
	}
}
