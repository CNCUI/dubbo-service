package com.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}
