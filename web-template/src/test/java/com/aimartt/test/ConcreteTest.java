/**
 * 
 */
package com.aimartt.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.aimartt.example.TestService;
import com.aimartt.test.support.BaseTest;

/**
 * 测试用例。
 * @author aimartt
 * @date 2015-03-31
 * @category 测试用例
 */
public class ConcreteTest extends BaseTest {

	@Value("${test}")
	private String test;
	
	@Autowired
	private TestService service;
	
	@Test
	public void testCase() {
		System.out.println(test);
		System.out.println(service.test());
	}
	
}