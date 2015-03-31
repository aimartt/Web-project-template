/**
 * 
 */
package com.aimartt.example;

import java.util.Random;

import org.springframework.stereotype.Service;

/**
 * 测试 Service。
 * @date 2015-03-31
 * @author aimartt
 * @category 测试 Service
 */
@Service
public class TestService {
	
	public int test() {
		return new Random().nextInt();
	}

}