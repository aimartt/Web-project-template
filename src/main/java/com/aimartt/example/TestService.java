/**
 * Copyright (c) 2009 FEINNO, Inc. All rights reserved.
 * This software is the confidential and proprietary information of 
 * FEINNO, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with FEINNO.
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